package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;


public class Ufo {

	//TODO fill your code
    // Private attributes
    private int column;
    private int row;
    private int resistance;

    // Constructor
    public UFO(int initialColumn, int initialRow) {
        this.column = initialColumn;
        this.row = initialRow;
        this.resistance = 1;
    }

	public void horizontalMove( // enum move ?? ){
		
	}

	public int getResistance(){

		return resistance;
	}

	public int getColumns(){
		return column;
	}

//

	public int getRow(){
		return row;
	}
	
	private boolean enabled;
	private Game game;
	
	//TODO fill your code

	public void computerAction() {
		if(!enabled && canGenerateRandomUfo()) {
			enable();
		}
	}
	
	private void enable() {
		//TODO fill your code
	}

	public void onDelete() {
		//TODO fill your code
	}

	/**
	 * Checks if the game should generate an ufo.
	 * 
	 * @return <code>true</code> if an ufo should be generated.
	 */
	private boolean canGenerateRandomUfo(){
		return game.getRandom().nextDouble() < game.getLevel().getUfoFrequency();
	}
	
}
