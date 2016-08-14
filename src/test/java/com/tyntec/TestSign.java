package com.tyntec;

import com.tyntec.enums.Move;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by kemaleser on 11.08.2016.
 * This class is used for unit testing
 */
public class TestSign extends TestCase {

    /** Check if the move types are true*/
    public static void testMoveTypes() {
        Assert.assertEquals(Move.ROCK.toString(),"ROCK");
        Assert.assertEquals(Move.PAPER.toString(),"PAPER");
        Assert.assertEquals(Move.SCISSORS.toString(),"SCISSORS");
        Assert.assertNotEquals(Move.SCISSORS.toString(),"SCISORS");
    }

    /** Check if the game conditions are true*/
    public static void testWinConditions() {
        Assert.assertEquals(Move.ROCK.play(Move.ROCK),0);
        Assert.assertEquals(Move.ROCK.play(Move.PAPER),2);
        Assert.assertEquals(Move.ROCK.play(Move.SCISSORS),1);
        Assert.assertEquals(Move.PAPER.play(Move.ROCK),1);
        Assert.assertEquals(Move.PAPER.play(Move.PAPER),0);
        Assert.assertEquals(Move.PAPER.play(Move.SCISSORS),2);
        Assert.assertEquals(Move.SCISSORS.play(Move.ROCK),2);
        Assert.assertEquals(Move.SCISSORS.play(Move.PAPER),1);
        Assert.assertEquals(Move.SCISSORS.play(Move.SCISSORS),0);
        Assert.assertNotEquals(Move.SCISSORS.play(Move.SCISSORS),1);
        Assert.assertNotEquals(Move.ROCK.play(Move.SCISSORS),2);
        Assert.assertNotEquals(Move.PAPER.play(Move.SCISSORS),1);
        Assert.assertNotEquals(Move.SCISSORS.play(Move.PAPER),-4);

    }

}
