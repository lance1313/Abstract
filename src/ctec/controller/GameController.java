package ctec.controller;
import java.util.ArrayList;

import ctec.model.*;
import ctec.view.GameFrame;
import ctec.view.GamePanel;

/**
 * 
 * @author Jacob
 *
 */
public class GameController 
{
	private ArrayList<PlayingTheGame> PlayingGame;
	private GamePanel panel;
	private GameFrame frame;

	public GameController()
	{
		//build components
		this.PlayingGame = new ArrayList<PlayingTheGame>();
		makePlayingList();
		panel = new GamePanel();
		frame = new GameFrame();
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
	public String showGameList()
	{
		String list = "";
		for(PlayingTheGame currentGame : PlayingGame)
		{
			 list.concat("this is a " + currentGame.toString() +  " the leader is " + currentGame.currentLeader() +"\n");
		}
		
		return list;
		
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
	
	public void quickSort(int low,int high)
	{
		if(low < high )
		{
			int midPoint = partition(low,high);
			quickSort(low,midPoint-1);
			quickSort(midPoint+1,high);
			
		}
	}
	
	/*
	 * pivot := A[hi]
    i := lo        // place for swapping
    for j := lo to hi – 1 do
        if A[j] ≤ pivot then
            swap A[i] with A[j]
            i := i + 1
    swap A[i] with A[hi]
	 */
	private int partition(int low,int high)
	{
		
		
		int position = low;
		PlayingTheGame pivot = PlayingGame.get(high);
		
		for(int spot = low; spot < high-1;spot++)
		{
			if(PlayingGame.get(spot).compareTo(pivot) <= 0 )
			{
				swap(position,spot);
				position++;
			}
		}
		swap(position,high);
		
		return position;
	}
			

}
