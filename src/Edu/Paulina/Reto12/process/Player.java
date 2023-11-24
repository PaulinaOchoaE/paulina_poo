package edu.Paulina.Reto12.process;

public class Player {
    private String name;
    private char symbol;
    private int score;
    private int number;

    public Player(String name,int number) {
        this.name = name;
        if(number==1){
            this.symbol = 'X';

        };
        if (number==2){
            this.symbol = '0';
        }

        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        this.score++;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
