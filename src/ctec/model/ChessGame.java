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
	
	

}
