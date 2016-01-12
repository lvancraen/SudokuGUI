
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class PuzzleButton extends JButton {
	
	public PuzzleButton() {
		title = null;
		button = new JButton();
	}
	
	public void setTitle() {
		Integer temp = getTitle();
		if (temp == null || temp == 9) {
			temp = 1;
			title = temp.toString();
		} else {
			temp++;
			title = temp.toString();
		}
		this.setText(title.toString());
	}
	
	private Integer getTitle() {
		String temp = this.getText();
		Integer x = null;
		if (temp == "1") {
			x = 1;
		}
		else if (temp == "2") {
			x = 2;
		}
		else if (temp == "3") {
			x = 3;
		}
		else if (temp == "4") {
			x = 4;
		}
		else if (temp == "5") {
			x = 5;
		}
		else if (temp == "6") {
			x = 6;
		}
		else if (temp == "7") {
			x = 7;
		}
		else if (temp == "8") {
			x = 8;
		}
		else if (temp == "9") {
			x = 9;
		}
		else {
			x = null;
		}
		return x;
		
		
	}
	
	public void newGame() {
		this.setText(null);
	}
	
	public void solveGame() {
		
	}
	
	public void hint() {
		
	}
	
	private String title;
	private JButton button;
	private final int ROWS = 9;
	private final int COLS = 9;
}
