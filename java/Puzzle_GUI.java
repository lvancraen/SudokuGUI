import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class Puzzle_GUI {
	
	public Puzzle_GUI() {
		frame = new JFrame("Sudoku Puzzle");
		puzzleButtons = new PuzzleButton[ROWS][COLS];
	}
	
	
	public void fillWindow() {
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(COLS, ROWS));
		
		for (int i = 0; i < COLS; i++) {
			for (int j = 0; j < ROWS; j++) {
				puzzleButtons[i][j] = new PuzzleButton();
				(puzzleButtons[i][j]).addActionListener(new ButtonListener() {
					
				});
				
				panel1.add(puzzleButtons[i][j]);
			}
		}
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		newGameButton = new JButton("New Game");
		newGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < ROWS; i++) {
					for (int j = 0; j < COLS; j++) {
						puzzleButtons[i][j].newGame();
					}
				}
			}
		});
		
		solveGameButton = new JButton("Solve Game");
		solveGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puzzleButton.solveGame();
			}
		});
		
		hintButton = new JButton("Hint");
		hintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puzzleButton.hint();
			}
		});
		
		buttonPanel = new JPanel();
		buttonPanel.add(newGameButton);
		buttonPanel.add(solveGameButton);
		buttonPanel.add(hintButton);
		
		textField = new JTextArea(10,25);
		
		panel2.add((textField), BorderLayout.CENTER);
		panel2.add((buttonPanel), BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add((panel1), BorderLayout.NORTH);
		frame.add((panel2), BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	private class ButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			for (int k = 0; k < ROWS; k++) {
				for (int l = 0; l < COLS; l++) {
					if (puzzleButtons[k][l] == e.getSource()) {
						puzzleButtons[k][l].setTitle();
					}
				}
			}
		}
	}
	
	private final int ROWS = 9;
	private final int COLS = 9;
	private PuzzleButton[][] puzzleButtons;
	private PuzzleButton puzzleButton;
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel buttonPanel;
	private JTextArea textField;
	private JButton newGameButton;
	private JButton solveGameButton;
	private JButton hintButton;
}
