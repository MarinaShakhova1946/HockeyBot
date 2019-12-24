package ru.marina.spsuace.telegramhockeybot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constant {

    public static final Team SKA = new Team("���", "�������", "�����-���������", "������");
    public static final Team LOK = new Team("���������", "��������", "���������", "������");
    public static final Team AKB = new Team("�� ����", "���������", "������", "������");
    public static final Team AVN = new Team("��������", "���������", "����", "������");

    public static final Schedule placeSKA = new Schedule("���", 4);
    public static final Schedule placeLOK = new Schedule("���������", 12);
    public static final Schedule placeAKB = new Schedule("�� ����", 1);
    public static final Schedule placeAVN = new Schedule("��������", 3);

    public static final Game game1 = new Game("���", "�� ����", "4:2", "1:0 �.����������; " +
            "1:1 �.������; 2:1 �.���������; 3:1 �.����������; 1:0 �.����������; 3:2 �.���������; 4:2 �.���������;");
    public static final Game game2 = new Game("�� ����", "������", "2:1", "0:1 �.�������; " +
            "1:1 �.������; 2:1 �.�������; ");
    public static final Game game3 = new Game("������", "����������", "2:1", "1:0 �.���������; " +
            "1:1 �.��������; 2:1 �.������; ");
    public static final Game game4 = new Game("���", "���������", "2:1", "1:0 �.���; " +
            "1:1 �.���������; 2:1 �.�����������; ");
    public static final Game game5 = new Game("��������", "������� �����", "2:1", "1:0 �.��������; " +
            "1:1 �.�����������; 2:1 �.������; ");
    public static final Game game6 = new Game("�������", "����������", "2:1", "1:0 �.��������; " +
            "1:1 �.���������; 2:1 �.������; ");

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
