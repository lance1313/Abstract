package ctec.view;

import java.awt.Color;

import javax.swing.*;

import org.w3c.dom.css.Rect;

public class GamePanel extends JPanel
{
	
	public GamePanel()
	{
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setSize(500, 500);
		this.setSize(getSize());		
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}

}
