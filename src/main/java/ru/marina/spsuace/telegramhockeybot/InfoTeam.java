package ru.marina.spsuace.telegramhockeybot;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

import static ru.marina.spsuace.telegramhockeybot.Constant.CHL;

public class InfoTeam extends BotCommand {

    private static final String commandIdentifier = "infoteam";
    private static final String description = "Information about teams";
    public InfoTeam() {
        super(commandIdentifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        String userName = chat.getUserName();

        if (userName == null || userName.isEmpty()) {
            userName = user.getFirstName() + " " + user.getLastName();
        }

        StringBuilder messageTextBuilder = new StringBuilder();

        String[] name;
        name = new String[4];
        for (int i = 0; i < 4; i++) {
            name[i]=CHL.getTeam(i).getName();
        }

        if (arguments != null && arguments.length > 0) {
            for (int i = 0; i < 4; i++) {
                name[i]=CHL.getTeam(i).getName();
                if(arguments[0].equals(name[i])){
                    messageTextBuilder.append("ИНФОРМАЦИЯ О КОМАНДЕ:\n");
                    messageTextBuilder.append("Название команды: ");
                    messageTextBuilder.append(CHL.getTeam(i).getName());
                    messageTextBuilder.append("Дивизион: ");
                    messageTextBuilder.append(CHL.getTeam(i).getDiv());
                    messageTextBuilder.append("Город: ");
                    messageTextBuilder.append(CHL.getTeam(i).getCity());
                    messageTextBuilder.append("Страна: ");
                    messageTextBuilder.append(CHL.getTeam(i).getCountry());
                }
            }
        }else{
            messageTextBuilder.append("Список всех команд КХЛ");
            for (int i = 0; i < 4; i++) {
                messageTextBuilder.append("\n");
                messageTextBuilder.append(CHL.getTeam(i).getName());
            }
            messageTextBuilder.append("\n\n");
            messageTextBuilder.append("Если вам нужна информация о какой то команде напишите её название после данной команды...");
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
