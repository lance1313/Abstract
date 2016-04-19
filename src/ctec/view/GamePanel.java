package ctec.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.w3c.dom.css.Rect;

public class GamePanel extends JPanel
{
	
	public JButton listButton;
	public JTextArea displayPane;
	
	public GamePanel()
	{
		listButton = new JButton("Press for abstract list");
		displayPane = new JTextArea(10,25);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.add(displayPane);
		this.add(listButton);
		this.setBackground(Color.CYAN);
		this.setSize(500, 500);
		this.setSize(getSize());		
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		listButton.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				if(PlayingGame insatceOf)
				{
					
				}
				
			}
		});
		
		
	}

}
