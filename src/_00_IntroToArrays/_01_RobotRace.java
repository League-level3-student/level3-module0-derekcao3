package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot r[] = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			r[i].setX(200 * i + 50);
			r[i].setY(500);
			r[i].setSpeed(10);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random move = new Random();

		int winner = 6;
		while (winner == 6) {
			for (int i = 0; i < r.length; i++) {

				r[i].move(move.nextInt(50));
				if(r[i].getY()<0) {
					winner =i+1;
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Party for robot " + winner + "!!!!");
		// 8. try different races with different amounts of robots.
		
		// 9. make the robots race around a circular track.

	}
}
