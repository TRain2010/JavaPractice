package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("TRain", 500);
        System.out.println("New score is " + newScore);
        calculateScore(210);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player "  + playerName + "score is " + score );
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player score: " + score);
        return score * 1000;
    }

}
