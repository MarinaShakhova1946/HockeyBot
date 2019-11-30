package ru.marina.spsuace.telegramhockeybot;

import java.util.List;

public class Championship {

    private List<Team> listTeam ;
    private List<Schedule> listTable ;

    public Championship(List<Team> teams1, List<Schedule> table1) {
        listTeam=teams1;
        listTable=table1;
    }
}
