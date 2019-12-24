package ru.marina.spsuace.telegramhockeybot;

public class Game {
    private String nameFirst;
    private String nameSecond;
    private String score;
    private String statistic;

    public Game(String nameFirst, String nameSecond, String score, String statistic) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.score = score;
        this.statistic = statistic;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }

    public String getScore() {
        return score;
    }

    public String getStatistic() {
        return statistic;
    }
}
