package ru.marina.spsuace.telegramhockeybot;

import java.util.Arrays;

public class Constant {

    public static final Team SKA = new Team("���","�������","�����-���������","������");
    public static final Team LOK = new Team("���������","��������","���������","������");
    public static final Team AKB = new Team("�� ����","���������","������","������");
    public static final Team AVN = new Team("��������","���������","����","������");

    public static final Schedule placeSKA = new Schedule("���",4);
    public static final Schedule placeLOK = new Schedule("���������",12);
    public static final Schedule placeAKB = new Schedule("�� ����",1);
    public static final Schedule placeAVN = new Schedule("��������",3);

    public static final Game game1 = new Game("���:�� ����","4:2","1:0 �.����������; " +
            "1:1 �.������; 2:1 �.���������; 3:1 �.����������; 1:0 �.����������; 3:2 �.���������; 4:2 �.���������;");
    public static final Game game2 = new Game("�� ����:������","2:1","0:1 �.�������; " +
            "1:1 �.������; 2:1 �.�������; ");
    public static final Game game3 = new Game("������:����������","2:1","1:0 �.���������; " +
            "1:1 �.��������; 2:1 �.������; ");

    public static final Championship CHL = new Championship(Arrays.asList(SKA,LOK,AKB,AVN),Arrays.asList(placeSKA,placeLOK,placeAKB,placeAVN));

}
