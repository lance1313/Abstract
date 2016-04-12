package ctec.controller;
import java.util.ArrayList;

import ctec.model.*;
import ctec.view.GamePanel;

/**
 * 
 * @author jlin3312
 *
 */
public class GameController 
{
	private ArrayList<PlayingTheGame> PlayingGame;
	private GamePanel panel;

	public GameController()
	{
		//build components
		makePlayingList();
		//build view
		
	}
	
	public void makePlayingList()
	{
		PlayingGame.add(new RiskGame());
		PlayingGame.add(new ChessGame());
	}
	
	public  void start()
	{
		
		
	}

}

