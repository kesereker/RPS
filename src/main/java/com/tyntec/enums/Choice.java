package com.tyntec.enums;

/**
 * Created by kemaleser on 11.08.2016.
 * This is the java enum which includes the game logic
 */
public enum Choice {
    /** Game moves */
    ROCK,
    PAPER,
    SCISSORS;

    /** Game outcomes */
    private static final int DRAW = 0;
    private static final int WIN = 1;
    private static final int LOSE = 2;

    /** Game Logic */
    public int play(Choice opponentChoice) {

        if(this == opponentChoice) {
            return DRAW;
        } else {
            if(this == ROCK) {
                if(opponentChoice == SCISSORS) {
                    return WIN;
                } else {
                    return LOSE;
                }

            } else if(this == PAPER) {
                if(opponentChoice == ROCK) {
                    return WIN;
                } else {
                    return LOSE;
                }
            } else {
                if(opponentChoice == PAPER) {
                    return WIN;
                } else {
                    return LOSE;
                }
            }
        }
    }
}
