package com.tyntec.enums;

/**
 * Created by kemaleser on 11.08.2016.
 * This is the java enum which includes the game logic
 */
public enum Move {
    /** Game moves */
    ROCK,
    PAPER,
    SCISSORS;

    /** Game outcomes */
    private static final int DRAW = 0;
    private static final int WIN = 1;
    private static final int LOSE = 2;

    /** Game Logic */
    public int play(Move moveAgainst) {
        if(this == ROCK) {
            switch (moveAgainst) {
                case ROCK:
                    return DRAW;
                case PAPER:
                    return LOSE;
                case SCISSORS:
                    return WIN;
            }
        }
        else if (this == PAPER) {
            switch (moveAgainst) {
                case ROCK:
                    return WIN;
                case PAPER:
                    return DRAW;
                case SCISSORS:
                    return LOSE;
            }
        }
        else {
            switch (moveAgainst) {
                case ROCK:
                    return LOSE;
                case PAPER:
                    return WIN;
                case SCISSORS:
                    return DRAW;
            }
        }
        return -1;
    }

}
