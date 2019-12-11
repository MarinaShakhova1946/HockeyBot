package ru.marina.spsuace.telegramhockeybot;

import java.util.List;
import java.util.Map;

public class Championship {

    private Map<String,Team> listTeam ;
    private List<Schedule> listTable ;

    public Championship(List<Schedule> table1) {
        listTable=table1;
    }

    public Team getTeam(String name) {
        return listTeam.get(name);
    }

    public void setTeams(Map<String, Team> teamMap) {
        listTeam = teamMap;
    }

    public Map<String,Team> getTeams() {
        return listTeam;
    }
}
