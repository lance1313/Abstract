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
	
	private void swap(int firstLocation, int secondLocation)
	{
		PlayingTheGame temp = PlayingGame.get(secondLocation);
		PlayingGame.set(firstLocation, PlayingGame.get(secondLocation));
		PlayingGame.set(secondLocation, temp); 
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < PlayingGame.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (PlayingGame.get(innerLoop-1).compareTo(PlayingGame.get(innerLoop)) > 0))
			{
				swap(innerLoop,innerLoop-1);
				innerLoop--;
				
			}
		}
	}

}
