package ctec.controller;
import java.util.ArrayList;

import ctec.model.*;

public class GameController 
{
	private ArrayList<PlayingTheGame> PlayingGame;

	public  void start()
	{
		
		
	}
	public void makePlayingList()
	{
		PlayingGame.add(new RiskGame());
		PlayingGame.add(new ChessGame());
	}

}
