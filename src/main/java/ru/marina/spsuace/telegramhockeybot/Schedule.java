package ru.marina.spsuace.telegramhockeybot;

public class Schedule {
    private String name;
    private int place;

    public Schedule(String name1, int place1) {
        name = name1;
        place = place1;
    }

    public String getName() {
        return name;
    }

    public int getPlace() {
        return place;
    }

}
