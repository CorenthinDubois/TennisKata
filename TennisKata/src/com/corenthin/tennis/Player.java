package com.corenthin.tennis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

	private String name;
	private int gameScore;
	public static final List<String> pointsDescription = new ArrayList<String>(Arrays.asList("love", "fifteen", "thirty", "forty"));
	
	public Player(String name) {
		this.name = name; 
	}

	public String getName() {
		return this.name;
	}

	public int getGameScore() {
		return this.gameScore;
	}
	
    public String getScoreDescription(){
        return pointsDescription.get(gameScore);
    }

}