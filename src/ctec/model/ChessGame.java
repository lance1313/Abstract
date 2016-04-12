package ctec.model;

import javax.swing.JOptionPane;


public class ChessGame extends Game 
{
	
	public ChessGame()
	{
		super();
		this.setBrand("None");
		this.setNumOfPlayers(2);
		this.setHasRules(true);
	}

	@Override
	public void illegalMove(String response)
	{
		
		
	}

	@Override
	public int wins() 
	{
		
		return 1;
	}

	@Override
	public String currentLeader() 
	{
		String leaderName = "";
		
		return leaderName;
	}

	@Override
	public void haveingFun(int funLevel) 
	{
		if(funLevel > 8)
		{
			JOptionPane.showMessageDialog(null, "You are having fun");
		}
		
		else 
		{
			JOptionPane.showMessageDialog(null, "Are you bored?");
		}
		
	}
	
	/**
	 * If the supplied variable compared comes befe the calling variable
	 * return -1.
	 * If it is after 
	 * return 1
	 * else if then are the same 
	 * return 0
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		
		if(compared instanceof PlayingTheGame)
		{
			if(this.wins() > ((PlayingTheGame )compared).wins())
			{
				
				comparedValue = 1;
				 
			}
			else if(this.wins() < ((PlayingTheGame )compared).wins())
			{
				comparedValue = -1;
			}
			
			else
			{
				comparedValue = 0;
			}
		}
		return comparedValue;
	}

}
