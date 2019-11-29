package ru.marina.spsuace.telegramhockeybot;

import java.util.ArrayList;

public class Championship {

    public class Team {
        private String name;
        private String division;
        private String city;
        private String country;

        public Team(String name1, String division1, String city1, String country1) {
            name = name1;
            division=division1;
            city= city1;
            country=country1;
        }
    }

    public class Table{
        private String name;
        private int place;

        public Table(String name1, int place1) {
            name = name1;
            place=place1;
        }
    }

    String[] names = {"СКА", "Локомотив", "Ак Барс", "Авангард"};
    int[] places = {4,12,1,3};
    String[] divisions = {"Боброва", "Тарасова", "Харламова", "Чернышева"};
    String[] cities = {"Санкт-Петербург", "Ярославль", "Казань", "Омск"};
    String[] countries = {"Россия"};

    public ArrayList ChampTeams(){
        ArrayList<Team> thisChamp = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            thisChamp.add(new Team( names[i],divisions[i],cities[i],countries[0]));
        }
        return thisChamp;
    }

    public ArrayList ChampTable(){
        ArrayList<Table> thisTable = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            thisTable.add(new Table( names[i],places[i]));
        }
        return thisTable;
    }
}
