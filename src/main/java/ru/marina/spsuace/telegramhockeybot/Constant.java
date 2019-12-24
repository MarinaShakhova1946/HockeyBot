package ru.marina.spsuace.telegramhockeybot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constant {

    public static final Team SKA = new Team("СКА", "Боброва", "Санкт-Петербург", "Россия");
    public static final Team LOK = new Team("Локомотив", "Тарасова", "Ярославль", "Россия");
    public static final Team AKB = new Team("Ак Барс", "Харламова", "Казань", "Россия");
    public static final Team AVN = new Team("Авангард", "Чернышева", "Омск", "Россия");

    public static final Schedule placeSKA = new Schedule("СКА", 4);
    public static final Schedule placeLOK = new Schedule("Локомотив", 12);
    public static final Schedule placeAKB = new Schedule("Ак Барс", 1);
    public static final Schedule placeAVN = new Schedule("Авангард", 3);

    public static final Game game1 = new Game("СКА", "ХК Сочи", "4:2", "1:0 Я.Коскиранта; " +
            "1:1 С.Шмелев; 2:1 А.Кузьменко; 3:1 Я.Коскиранта; 1:0 Я.Коскиранта; 3:2 М.Стрёмвалль; 4:2 С.Плотников;");
    public static final Game game2 = new Game("Ак Барс", "Сибирь", "2:1", "0:1 В.Комаров; " +
            "1:1 Н.Лямкин; 2:1 А.Галимов; ");
    public static final Game game3 = new Game("Витязь", "Нефтехимик", "2:1", "1:0 А.Бывальцев; " +
            "1:1 Я.Берглунд; 2:1 А.Макеев; ");
    public static final Game game4 = new Game("СКА", "Металлург", "2:1", "1:0 А.Зуб; " +
            "1:1 Д.Расмуссен; 2:1 Д.Кагарлицкий; ");
    public static final Game game5 = new Game("Авангард", "Салават Юлаев", "2:1", "1:0 Е.Мартынов; " +
            "1:1 Т.Хартикайнен; 2:1 В.Войнов; ");
    public static final Game game6 = new Game("Трактор", "Нефтехимик", "2:1", "1:0 Е.Виртанен; " +
            "1:1 М.Хайруллин; 2:1 Л.Седлак; ");

    public static final Game[] firstWeek = {game1, game2, game3};
    public static final List<Game> listGame1 = Arrays.asList(firstWeek);
    public static final Tour tour1 = new Tour(listGame1, "first");

    public static final Game[] secondWeek = {game4, game5, game6};
    public static final List<Game> listGame2 = Arrays.asList(secondWeek);
    public static final Tour tour2 = new Tour(listGame2, "second");

    public static final Championship CHL = new Championship(Arrays.asList(tour1, tour2));

    static {
        Map<String, Team> teamMap = new HashMap<>();
        teamMap.put(SKA.getName(), SKA);
        teamMap.put(LOK.getName(), LOK);
        teamMap.put(AKB.getName(), AKB);
        teamMap.put(AVN.getName(), AVN);
        CHL.setTeams(teamMap);
    }

    static {
        Map<String, Schedule> scheduleMap = new HashMap<>();
        scheduleMap.put(SKA.getName(), placeSKA);
        scheduleMap.put(LOK.getName(), placeLOK);
        scheduleMap.put(AKB.getName(), placeAKB);
        scheduleMap.put(AVN.getName(), placeAVN);
        CHL.setSchedule(scheduleMap);
    }
}
