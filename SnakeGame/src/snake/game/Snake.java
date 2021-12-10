package snake.game;
import javax.swing.*;

public class Snake extends JFrame{

	//creating constructor
		Snake(){
			super("Snake Game");
			Board b = new Board();
			add(b);
			pack();
			
			setLocationRelativeTo(null); //for center location 
//			setTitle("Snake Game");
			setResizable(false);
		}
		
	public static void main(String[] args) {
		new Snake().setVisible(true);
	}
}
