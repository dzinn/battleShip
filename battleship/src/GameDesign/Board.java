package GameDesign;

public class Board {
	
	public char[][] GAMEBOARD;
	int shipsDestroyed;
	 
	public Board(){
		GAMEBOARD = new char[10][10];
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				GAMEBOARD[i][j] = 0;
			}
		}
	}
	
	public void initialize(){
		
	}
	
	public void checkHitOrMiss(){
		
	}
	
	public void checkAll(){
		if(shipsDestroyed == 0){
			//end the GAME
		}
	}
}
