package com.corenthin.tennis;

import com.corenthin.tennis.Player;

public class Game {

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

	/**
     * Method to display the game score.
     *
     * @return current game score
     */
    public String getScore() {
        if (this.hasTennisGameWinner()) {
            return getLeadingPlayer().getName() + " wins the game";
        } else if (this.isDeuce()) {
            return "deuce";
        } else if (this.hasAdvantage(this.player1,this.player2)) {
            return "advantage " + this.player1.getName();
        } else if (this.hasAdvantage(this.player2,this.player1)) {
            return "advantage " + this.player2.getName();
        }
        return player1.getScoreDescription() + ", " + player2.getScoreDescription();
    }     
    
	/**
	 * Method to find the leading player.
	 *
	 * @return Player
	 */
    public Player getLeadingPlayer() {
        return (player1.getGameScore() > player2.getGameScore()) ? player1 : player2;
    }
    
	/**
     * Method to find if there is a winner.
     *
     * @return boolean
     */
	private boolean hasTennisGameWinner() {
		int scoreDiff = this.scoreDiff();
		return scoreDiff >= 2
				&& (this.player1.getGameScore() >= 4 || this.player2.getGameScore() >= 4);
	}
	
	/**
     * Method to find if there is currently a deuce.
     *
     * @return boolean
     */
	private boolean isDeuce() {
		return this.player1.getGameScore() >= 3 && this.player2.getGameScore() >= 3 && this.player1.getGameScore() == this.player2.getGameScore();
	}
	
	/**
     * Method to find if the player has the advantage on the other.
     *
     * @return boolean
     */
	private boolean hasAdvantage(Player player, Player adversary) {
		int scoreDiff = this.scoreDiff();
		return player.getGameScore() >= 4 && adversary.getGameScore() >= 3 && scoreDiff == 1;
	}
	
	/**
     * Method to find the score difference between the players.
     *
     * @return integer
     */
	private int scoreDiff() {
		int scoreDiff = Math.abs(this.player1.getGameScore()
				- this.player2.getGameScore());
		return scoreDiff;
	}
    
}