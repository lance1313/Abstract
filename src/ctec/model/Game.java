package ctec.model;

public abstract class Game
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

}
