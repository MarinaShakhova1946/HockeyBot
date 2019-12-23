package ru.marina.spsuace.telegramhockeybot;

import java.util.List;

public class Tour {
    private List<Game> listGame ;
    private String nomWeek;

    public Tour(List<Game> games1, String nomWeek1) {
       listGame=games1;
       nomWeek=nomWeek1;
    }

    public String getNomer() {
        return nomWeek;
    }

    public Game getGame(int index) {
        return listGame.get(index);
    }
}
