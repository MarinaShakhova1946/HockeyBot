package ru.marina.spsuace.telegramhockeybot;

import java.util.List;
import java.util.Map;

public class Championship {

    private Map<String,Team> listTeam ;
    private Map<String,Schedule> listTable ;
    private List<Tour> listTour ;

    public Championship(List<Tour> tours) {
        listTour=tours;
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

    public Schedule getSchedule(String name) {
        return listTable.get(name);
    }

    public void setSchedule(Map<String, Schedule> scheduleMap) {
        listTable = scheduleMap;
    }

    public Map<String,Schedule> getSchedule() {
        return listTable;
    }

    public Tour getTour(int index) {
        return listTour.get(index);
    }
}
