package ru.marina.spsuace.telegramhockeybot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingCommandBot {

    public static final String USERNAME = "@Hockey_team_bot";
    public static final String TOKEN = System.getenv("VARIABLE_NAME");

    private long chat_id;

    public MyBot(DefaultBotOptions botOptions) {
        super(botOptions, USERNAME);
        register(new InfoTeam());
    }

        public static void main(String[] args) {
            ApiContextInitializer.init();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
            try {
                DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);
                botOptions.setProxyHost("180.183.225.133");
                botOptions.setProxyPort(8080);
                botOptions.setProxyType(DefaultBotOptions.ProxyType.HTTP);
                telegramBotsApi.registerBot(new MyBot(botOptions));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }


    @Override
    public void processNonCommandUpdate(Update update) {
        update.getUpdateId();

        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        chat_id = update.getMessage().getChatId();
        sendMessage.setText(input(update.getMessage().getText()));

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String input(String msg){
        if(msg.contains("Hi") || msg.contains("Hello") || msg.contains("Привет")){
            return "Привет фанатам! Я спротивный бот КХЛ. Если любишь хоккей, погнали!!!";
        }
        return "Не понял!";
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }
}



