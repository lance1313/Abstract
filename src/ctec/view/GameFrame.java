package ctec.view;

import javax.swing.*;

public class GameFrame extends JFrame
{
	private GamePanel basePanel = new GamePanel();
	
	public GameFrame()
	{
		setupFrame();
	}
	
	
	
	private void setupFrame() {

		this.setContentPane(basePanel);// this means i can do all the parent
										// class can do to .
		this.setSize(500, 500);
		this.setResizable(true);
		setVisible(true);

	}

}
