package ru.marina.spsuace.telegramhockeybot;

import java.util.Arrays;
import java.util.List;

public class Tour {
    public static final Game game1 = new Game("���:�� ����","4:2","1:0 �.����������; " +
            "1:1 �.������; 2:1 �.���������; 3:1 �.����������; 1:0 �.����������; 3:2 �.���������; 4:2 �.���������;");
    public static final Game game2 = new Game("�� ����:������","2:1","0:1 �.�������; " +
            "1:1 �.������; 2:1 �.�������; ");
    public static final Game game3 = new Game("������:����������","2:1","1:0 �.���������; " +
            "1:1 �.��������; 2:1 �.������; ");

    private Game[] arrayGame = { game1,game2,game3};
    private List<Game> listGame = Arrays.asList(arrayGame);

    public Tour(List<Game> games1) {
       listGame=games1;
    }
}
