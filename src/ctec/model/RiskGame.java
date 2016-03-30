package ctec.model;


public class RiskGame extends Game
{
	
	public RiskGame()
	{
		super();
		this.setBrand("Hasbro");
		this.setNumOfPlayers(4);
		this.setHasRules(true);
		
	}

	@Override
	public void illegalMove(String response) 
	{
		
		
	}

	@Override
	public int wins()
	{
		
		return 0;
	}

	@Override
	public String currentLeader()
	{
		
		return null;
	}

	@Override
	public void haveingFun(int funLevel) 
	{
		
		
	}

}
