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
