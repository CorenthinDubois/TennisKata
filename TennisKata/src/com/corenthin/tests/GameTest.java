package com.corenthin.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

import com.corenthin.tennis.Game;
import com.corenthin.tennis.Player;

public class GameTest {

    Player player1;
    Player player2;
    Game game;

    @Before
    public void beforeGameTest() {
    	player1 = new Player("player1");
    	player2 = new Player("player2");
        game = new Game(player1, player2);
    }

    @Test
    public void scoreDescriptionForNewGame() {
        assertEquals("love, love", game.getScore());
    }
    
    @Test
    public void scoreDescriptionForOnePointWon() {
        player1.winPoint();
        assertEquals("fifteen, love", game.getScore());
    }
}