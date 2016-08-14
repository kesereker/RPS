package com.tyntec.main;

import com.tyntec.enums.Choice;
import java.util.Random;

/**
 * Created by kemaleser on 14.08.2016.
 * Main class to run the code
 */
public class Main {

    public static void main(String [] args) {
        startGame(100);
    }

    /** Starts the game, Player A always chooses paper, Player B is randomized */
    public static void startGame(int gameCount) {
        int playerA = 0, playerB = 0, tie =0;

        Choice[] choices = Choice.values();
        Random random = new Random();

        for(int i=0; i<gameCount; i++) {
            int index = random.nextInt(choices.length);

            if(Choice.PAPER.play(choices[index]) == 0) {
                tie++;
            } else if(Choice.PAPER.play(choices[index]) == 1) {
                playerA++;
            } else if(Choice.PAPER.play(choices[index]) == 2) {
                playerB++;
            }
        }
        System.out.println("Player A wins " + playerA + " of " + gameCount + " games");
        System.out.println("Player B wins " + playerB + " of " + gameCount + " games");
        System.out.println("Tie " + tie + " of " + gameCount + " games");
    }

}
