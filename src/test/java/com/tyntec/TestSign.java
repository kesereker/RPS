package com.tyntec;

import com.tyntec.enums.Choice;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by kemaleser on 11.08.2016.
 * This class is used for unit testing
 */
public class TestSign extends TestCase {

    /** Check if the move types are true*/
    public static void testMoveTypes() {
        Assert.assertEquals(Choice.ROCK.toString(),"ROCK");
        Assert.assertEquals(Choice.PAPER.toString(),"PAPER");
        Assert.assertEquals(Choice.SCISSORS.toString(),"SCISSORS");
        Assert.assertNotEquals(Choice.SCISSORS.toString(),"SCISORS");
    }

    /** Check if the game conditions are true*/
    public static void testWinConditions() {
        Assert.assertEquals(Choice.ROCK.play(Choice.ROCK),0);
        Assert.assertEquals(Choice.ROCK.play(Choice.PAPER),2);
        Assert.assertEquals(Choice.ROCK.play(Choice.SCISSORS),1);
        Assert.assertEquals(Choice.PAPER.play(Choice.ROCK),1);
        Assert.assertEquals(Choice.PAPER.play(Choice.PAPER),0);
        Assert.assertEquals(Choice.PAPER.play(Choice.SCISSORS),2);
        Assert.assertEquals(Choice.SCISSORS.play(Choice.ROCK),2);
        Assert.assertEquals(Choice.SCISSORS.play(Choice.PAPER),1);
        Assert.assertEquals(Choice.SCISSORS.play(Choice.SCISSORS),0);
        Assert.assertNotEquals(Choice.SCISSORS.play(Choice.SCISSORS),1);
        Assert.assertNotEquals(Choice.ROCK.play(Choice.SCISSORS),2);
        Assert.assertNotEquals(Choice.PAPER.play(Choice.SCISSORS),1);
        Assert.assertNotEquals(Choice.SCISSORS.play(Choice.PAPER),-4);

    }

}
