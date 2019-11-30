package ru.marina.spsuace.telegramhockeybot;

import java.util.Arrays;

public class Constant {

    public static final Team SKA = new Team("СКА","Боброва","Санкт-Петербург","Россия");
    public static final Team LOK = new Team("Локомотив","Тарасова","Ярославль","Россия");
    public static final Team AKB = new Team("Ак Барс","Харламова","Казань","Россия");
    public static final Team AVN = new Team("Авангард","Чернышева","Омск","Россия");

    public static final Schedule placeSKA = new Schedule("СКА",4);
    public static final Schedule placeLOK = new Schedule("Локомотив",12);
    public static final Schedule placeAKB = new Schedule("Ак Барс",1);
    public static final Schedule placeAVN = new Schedule("Авангард",3);

    public static final Game game1 = new Game("СКА:ХК СОЧИ","4:2","1:0 Я.Коскиранта; " +
            "1:1 С.Шмелев; 2:1 А.Кузьменко; 3:1 Я.Коскиранта; 1:0 Я.Коскиранта; 3:2 М.Стрёмвалль; 4:2 С.Плотников;");
    public static final Game game2 = new Game("Ак Барс:Сибирь","2:1","0:1 В.Комаров; " +
            "1:1 Н.Лямкин; 2:1 А.Галимов; ");
    public static final Game game3 = new Game("Витязь:Нефтехимик","2:1","1:0 А.Бывальцев; " +
            "1:1 Я.Берглунд; 2:1 А.Макеев; ");

    public static final Championship CHL = new Championship(Arrays.asList(SKA,LOK,AKB,AVN),Arrays.asList(placeSKA,placeLOK,placeAKB,placeAVN));

}
