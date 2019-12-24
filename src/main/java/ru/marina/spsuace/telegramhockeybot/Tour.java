package ru.marina.spsuace.telegramhockeybot;

import java.util.List;

public class Tour {
    private List<Game> listGame;
    private String numWeek;

    public Tour(List<Game> listGame, String numWeek) {
        this.listGame = listGame;
        this.numWeek = numWeek;
    }

    public String getNumber() {
        return numWeek;
    }

    public Game getGame(int index) {
        return listGame.get(index);
    }
}
