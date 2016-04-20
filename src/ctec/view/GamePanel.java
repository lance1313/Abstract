package ctec.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.w3c.dom.css.Rect;

import ctec.controller.GameController;

public class GamePanel extends JPanel
{
	private GameController baseController;
	public JButton listButton;
	public JTextArea textArea;
	
	public GamePanel()
	{
		listButton = new JButton("Press for abstract list");
		textArea = new JTextArea(10,25);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.add(textArea);
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
				
				baseController.insertionSort();
				
				textArea.setText(baseController.showGameList());
			}
		});
		
		
	}

}
