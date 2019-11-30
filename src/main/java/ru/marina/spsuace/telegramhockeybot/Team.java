package ru.marina.spsuace.telegramhockeybot;

public class Team {
    private String name;
    private String division;
    private String city;
    private String country;

    public Team(String name1, String division1, String city1, String country1) {
        name = name1;
        division = division1;
        city = city1;
        country = country1;
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
