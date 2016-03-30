package ctec.model;

/*
 * @author Jacob.
 */
public interface PlayingTheGame 
{
	
	public void illegalMove(String response);
	
	public int wins();
	
	public String currentLeader();
	public void haveingFun(int funLevel);

}
