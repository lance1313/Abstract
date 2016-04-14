package ctec.model;

/**
 * implements scomparible interface.
 * @author jlin3312
 *
 */
public abstract class Game implements PlayingTheGame,Comparable
{
// game-> ball game-> 
	//board game-> numOfPlayers, hasBoard,  hasRules
	
	private int numOfPlayers;
	private String brand;
	private boolean hasRules;
	
	
	public int getNumOfPlayers() 
	{
		return numOfPlayers;
	}
	public void setNumOfPlayers(int numOfPlayers)
	{
		this.numOfPlayers = numOfPlayers;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public boolean getHasRules()
	{
		return hasRules;
	}
	public void setHasRules(boolean hasRules) 
	{
		this.hasRules = hasRules;
	}
	
	/**
	 * inherited to ll other classes to prevent  repetition in code.
	 */
	public String toString()
	{
		String description = "This is a" + this.getClass().getName() + "and has a " + currentLeader();
		return description;
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
