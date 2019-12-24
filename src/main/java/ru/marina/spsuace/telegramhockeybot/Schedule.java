package ru.marina.spsuace.telegramhockeybot;

public class Schedule {
    private String name;
    private int place;

    public Schedule(String name, int place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int getPlace() {
        return place;
    }
}
