package ru.marina.spsuace.telegramhockeybot;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import static ru.marina.spsuace.telegramhockeybot.Constant.CHL;

public class InfoTable extends BotCommand {

    private static final String commandIdentifier = "infotable";
    private static final String description = "Information about result table";

    public InfoTable() {
        super(commandIdentifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        String userName = chat.getUserName();
        if (userName == null || userName.isEmpty()) {
            userName = user.getFirstName() + " " + user.getLastName();
        }
        StringBuilder messageTextBuilder = new StringBuilder();
        if (arguments != null && arguments.length > 0) {
            Schedule schedule = CHL.getSchedule(arguments[0]);
            if (schedule != null) {
                messageTextBuilder.append("����� � ��������� �������\n");
                messageTextBuilder.append("�������: ");
                messageTextBuilder.append(schedule.getName());
                messageTextBuilder.append("\n");
                messageTextBuilder.append("�����: ");
                messageTextBuilder.append(schedule.getPlace());
                messageTextBuilder.append("\n");
            }
        } else {
            messageTextBuilder.append("��������� ������� ���:");
            messageTextBuilder.append("\n");
            for (String name : CHL.getSchedule().keySet()) {
                Schedule schedule = CHL.getSchedule(name);
                messageTextBuilder.append("\n");
                messageTextBuilder.append("�������:   ");
                messageTextBuilder.append(schedule.getName());
                messageTextBuilder.append("    �����:    ");
                messageTextBuilder.append(schedule.getPlace());
                messageTextBuilder.append("\n");
            }
            messageTextBuilder.append("\n\n");
            messageTextBuilder.append("��� ������ ����� ������ ����� �������� ��� �������� ����� �������...");
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
