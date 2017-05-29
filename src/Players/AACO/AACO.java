package Players.AACO;

import Engine.Logger;
import Interface.GobbletPart1;
import Interface.PlayerModule;
import Interface.PlayerMove;
import Interface.Coordinate;

    public class AACO implements PlayerModule, GobbletPart1 {

	public static void main(String[] args) {
		System.out.println("Hello World.......");
	}


	public AACO(){
		//Implement constructor
	}

	public PlayerMove move(){
		return new PlayerMove(0, 0, 0, new Coordinate(0,0), new Coordinate(1,1));
	}


	public void playerInvalidated(int playerId){

	}

	public void lastMove(PlayerMove m) {

	}


	public void init(Logger logger, int playerId) {

	}


	public int getID() {
		return 0;
	}


	/** Describes what is visible on the board at the given location
	  * @param row - the row of interest on the board (0-based)
	  * @param col - the column of interest on the board (0-based)
	  * @return int - size of the piece at the given location (row, col)
	  * -1 if empty.
	*/
	public int getTopOwnerOnBoard(int row, int col) {
		return 0;
	}


	public int getTopSizeOnBoard(int row, int col) {
		return 0;
	}


	public int getTopSizeOnStack(int playerId, int stackNum) {
		return 0;
	}


	public void dumpGameState() {

	}

}
