package ru.marina.spsuace.telegramhockeybot;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Help extends BotCommand {

    private static final String commandIdentifier = "help";
    private static final String description = "Information about commands";

    public Help() { super(commandIdentifier, description); }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        String userName = chat.getUserName();

        if (userName == null || userName.isEmpty()) {
            userName = user.getFirstName() + " " + user.getLastName();
        }

        StringBuilder messageTextBuilder = new StringBuilder();

        messageTextBuilder.append("���������� � ����������� ������� ����������� ����:\n");
        messageTextBuilder.append("/help - �������, ������������ ������ ���� ������;\n");
        messageTextBuilder.append("/infoteam - �������, ������������ ������ ���� ������ � ��������� ���������� " +
                        "����� �� ���;\n");
        messageTextBuilder.append("/infotable - �������, ������������ ��������� ������� � ��������� ���������� " +
                "����� ������� � ���;\n");
        messageTextBuilder.append("/infotour - �������, ������������ ���������� " +
                "� ��������� �� ������ �����;\n");


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
