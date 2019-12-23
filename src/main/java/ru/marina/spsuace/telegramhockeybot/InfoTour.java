package ru.marina.spsuace.telegramhockeybot;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import static ru.marina.spsuace.telegramhockeybot.Constant.CHL;

public class InfoTour extends BotCommand {

    private static final String commandIdentifier = "infotour";
    private static final String description = "Information about tours";
    public InfoTour() {
        super(commandIdentifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        String userName = chat.getUserName();

        if (userName == null || userName.isEmpty()) {
            userName = user.getFirstName() + " " + user.getLastName();
        }

        StringBuilder messageTextBuilder = new StringBuilder();

        String[] noms;
        noms = new String[2];
        for (int i = 0; i < 2; i++) {
            noms[i]=CHL.getTour(i).getNomer();
        }

        if (arguments != null && arguments.length > 0) {
            messageTextBuilder.append("Прошедшие за выбранную неделю игры:\n");
            for (int i = 0; i < 2; i++) {
                if(arguments[0].equals(noms[i])){
                    for (int j = 0; j < 3; j++) {
                        messageTextBuilder.append(CHL.getTour(i).getGame(j).getName());
                        messageTextBuilder.append("\n");
                        messageTextBuilder.append(CHL.getTour(i).getGame(j).getScore());
                        messageTextBuilder.append("\n");
                        messageTextBuilder.append(CHL.getTour(i).getGame(j).getStatistic());
                        messageTextBuilder.append("\n\n");
                    }
                }
            }
        }else{
            messageTextBuilder.append("Введите номер недели после данной команды для просмотра информации...");
            messageTextBuilder.append("\n");
            messageTextBuilder.append("Доступные к просмотру: first,second;");
        }

        SendMessage answer = new SendMessage();
        answer.setChatId(chat.getId().toString());
        answer.setText(messageTextBuilder.toString());
        try {
            absSender.execute(answer);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
