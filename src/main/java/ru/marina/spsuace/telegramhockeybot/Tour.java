package ru.marina.spsuace.telegramhockeybot;

import java.util.Arrays;
import java.util.List;

public class Tour {
    public static final Game game1 = new Game("СКА:ХК СОЧИ","4:2","1:0 Я.Коскиранта; " +
            "1:1 С.Шмелев; 2:1 А.Кузьменко; 3:1 Я.Коскиранта; 1:0 Я.Коскиранта; 3:2 М.Стрёмвалль; 4:2 С.Плотников;");
    public static final Game game2 = new Game("Ак Барс:Сибирь","2:1","0:1 В.Комаров; " +
            "1:1 Н.Лямкин; 2:1 А.Галимов; ");
    public static final Game game3 = new Game("Витязь:Нефтехимик","2:1","1:0 А.Бывальцев; " +
            "1:1 Я.Берглунд; 2:1 А.Макеев; ");

    private Game[] arrayGame = { game1,game2,game3};
    private List<Game> listGame = Arrays.asList(arrayGame);

    public Tour(List<Game> games1) {
       listGame=games1;
    }
}
