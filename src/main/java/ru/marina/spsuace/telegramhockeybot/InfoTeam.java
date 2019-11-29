package ru.marina.spsuace.telegramhockeybot;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;

public class InfoTeam extends BotCommand {

    private static final String commandIdentifier = "infoteam";
    private static final String description = "Information about teams";
    public InfoTeam() {
        super(commandIdentifier, description);
    }

    private Championship championship=new Championship();
    private ArrayList<Championship.Team> thisChamp = new ArrayList<>();

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        String userName = chat.getUserName();

        if (userName == null || userName.isEmpty()) {
            userName = user.getFirstName() + " " + user.getLastName();
        }

        StringBuilder messageTextBuilder = new StringBuilder("���������� �������� ������������ ��� ������� ");
        messageTextBuilder.append("\n");
        messageTextBuilder.append("ska");
        thisChamp=championship.ChampTeams();
        for (int i = 0; i < 4; i++) {
            messageTextBuilder.append("\n");
            messageTextBuilder.append(thisChamp.get(i));
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
