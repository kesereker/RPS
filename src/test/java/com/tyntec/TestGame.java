package com.tyntec;

import com.tyntec.enums.Choice;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.tyntec.main.Main.startGame;

/**
 * Created by kemaleser on 11.08.2016.
 * This class is used for unit testing
 */
public class TestGame extends TestCase {

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

    /** Check startGame method, sums the win counts to see if they add up to 100*/
    public static void testStartingGame() {
        PrintStream oldOutput = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        startGame(100);
        System.setOut(oldOutput);
        String output = new String(outputStream.toByteArray());
        Assert.assertNotNull(outputStream);
        Assert.assertTrue(output.contains("Player A"));
        Assert.assertTrue(output.contains("Player B"));
        Assert.assertTrue(output.contains("Tie"));
        String playerA = output.substring(14,16);
        String playerB = output.substring(44,46);
        String tie = output.substring(64,66);
        Assert.assertTrue(100 == Integer.parseInt(playerA) + Integer.parseInt(playerB) + Integer.parseInt(tie));
    }
}
