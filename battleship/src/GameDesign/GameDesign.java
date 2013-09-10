package GameDesign;


/*
 * This class should have the main method. this is where the game starts.
 * 
 * 
 */

public class GameDesign {
	public static void main(String args[]) {
		UserInterface UI = new UserInterface();
		DefaultOpponent AI = new DefaultOpponent();
		
		AI.setShips();
		System.out.println("lalalaa");
		UI.start();
		
	}
}
