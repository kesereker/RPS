package com.tyntec.main;

import com.tyntec.enums.Move;

import java.util.Random;

/**
 * Created by kemaleser on 14.08.2016.
 * Main class to run the code
 */
public class Main {

    public static void main(String [] args) {
        startGame(100);
    }

    /** This function starts the game, player 1 always chooses paper, player 2 is randomized */
    private static void startGame(int gameCount) {
        int pA = 0, pB = 0, tie =0;

        Move[] moves = Move.values();
        Random random = new Random();

        for(int i=0;i<gameCount;i++){
            int index = random.nextInt(moves.length);

            if (Move.PAPER.play(moves[index]) == 0) {
                tie++;
            }
            else if (Move.PAPER.play(moves[index]) == 1){
                pA++;
            }
            else if (Move.PAPER.play(moves[index]) == 2) {
                pB++;
            }
        }
        System.out.println("Player A wins " + pA + " of " + gameCount + " games");
        System.out.println("Player B wins " + pB + " of " + gameCount + " games");
        System.out.println("Tie " + tie + " of " + gameCount + " games");
    }

}
