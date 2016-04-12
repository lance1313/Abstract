package ctec.controller;
import java.util.ArrayList;

import ctec.model.*;

/**
 * 
 * @author jlin3312
 *
 */
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
