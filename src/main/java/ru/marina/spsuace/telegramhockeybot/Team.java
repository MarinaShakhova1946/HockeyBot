package ru.marina.spsuace.telegramhockeybot;

public class Team {
    private String name;
    private String division;
    private String city;
    private String country;

    public Team(String name, String division, String city, String country) {
        this.name = name;
        this.division = division;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getDiv() {
        return division;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
