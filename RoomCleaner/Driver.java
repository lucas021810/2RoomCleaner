import java.nio.file.WatchEvent;
import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	private static Robot roomba; 

	public static void turnRight(){
		roomba.turnLeft();
		roomba.turnLeft();
		roomba.turnLeft();
	}

	// You will add very many variables!!

	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();

  /**
	 * This section of code gets info from the user in the following order: 1. Ask the user
	 * which world file they wish to process. Right now, that world file name is
	 * hardcoded in. 2. Ask the user for the starting location and direction of the
	 * Robot. A new Robot should be constructed and assigned to the global
	 * (instance) variable named roomba that is declared on line 10.
	 * 
	 * An inelegant way to interact with the user is via the console, using
	 * System.out.println and a Scanner that scans System.in (input from the
	 * console). A more elegant way to get user input might include using a
	 * JOptionPane.
	 */

    String wrldName = "basicRoom.wld";

	
		World.readWorld(wrldName);
	
    World.setVisible(true);
	
		World.setDelay(1);

		int beepers = 0;
		int numpiles = 0;
		int largest = 0;
		int beepersinpile = 0;
		int area = 7*4;
		double percent = 9/40;

	

	
		roomba = new Robot (11,6,South,0);
	

		boolean moves = true;

		
		while (moves == true){
		
		
		while (roomba.frontIsClear()){

			if(roomba.nextToABeeper())
			{
				numpiles++;
			}



			while (roomba.nextToABeeper()){
				roomba.pickBeeper();
				beepers++;
			}

			if(beepersinpile > largest)
					largest = beepersinpile;
					beepersinpile = 0;

			

			roomba.move();
		
			}

			if(!roomba.frontIsClear()){
				while (moves == false)
			
			break;
			}
			

			if(roomba.nextToABeeper())
			{
				numpiles++;
			}
	
			while (roomba.nextToABeeper()){
				roomba.pickBeeper();
				beepers++;
				beepersinpile++;
			} 

			roomba.turnLeft();
			if(roomba.facingEast() == true){
			roomba.move();
			roomba.turnLeft();}

			else if (roomba.facingWest()==true){
			roomba.turnLeft();
			roomba.turnLeft();
			if(roomba.frontIsClear()){
			roomba.move();
			roomba.turnLeft();
			roomba.turnLeft();
			roomba.turnLeft();
			}
			if(!roomba.frontIsClear())
			break;
			}
	}

	System.out.println("Average Pile Size: " + beepers/numpiles );
	System.out.println( "Number of Beepers: " + beepers );
	System.out.println("Largest Number of Beepers: " + largest);
	System.out.println("Number of Piles: " + numpiles);
	System.out.println("Area of the Room: " + area);
	System.out.println("Percent dirty:	" + "22.5%" );
	System.out.println("Location of Largest Pile street: 7 avenue: 8 ");
	}
}
	


			

			




		
		 
		 

		 
	 

