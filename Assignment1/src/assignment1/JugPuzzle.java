package assignment1;
/**
 * @author Michael Byun
**/
/**
 * This class consists of method that allows JugPuzzleController to read from and use to play
 * JugPuzzle game. 
 **/
public class JugPuzzle {
	
	private Jug jug0, jug1, jug2;
	private int moves = 0;
	private Jug [] a = new Jug[3];
	
	/*
	 * Construtor of JugPuzzle class. Initializes the three jugs.
	 */
	public JugPuzzle(){
		jug0 = new Jug(0);
		jug1 = new Jug(1);
		jug2 = new Jug(2);
		a[0] = jug0;
		a[1] = jug1;
		a[2] = jug2;
	}
	/** This method spills the jugs into other jugs and calculates the proper amount inside each jugs.  
	 * @param from Displays string spill from jug or into jug
	 * @param to   The jug to spill from
	 * @return moves This method returns the current number of moves the user took.
	 */
	public int move(int from, int to){
		a[to].setAmount(a[from].getAmount() + a[to].getAmount());
		a[from].setAmount(a[to].getAmount() - a[to].getCapacity());
		if(a[to].getAmount() >= a[to].getCapacity() ){
			a[to].setAmount(a[to].getCapacity());
		}
		if(a[from].getAmount() <= 0){
			a[from].setAmount(0);
		}		
		moves++;
		return moves;
	}
 	/**This method checks if the puzzle is solved 
 	 * @return <tt>true</tt> if jug0 and jug1 amount is 4  
 	 * **/
	
	public boolean getIsPuzzleSolved(){
		if(jug0.getAmount() == 4 && jug1.getAmount() == 4){
			return true;
		}
		return false;
		
	}
	/**
		returns string value of the amount and capacity inside the jugs.
	**/
	public String toString(){
		String s="";
		s = s+ this.moves + " ";
		s = s + " " + jug0.getJugNum() + ": (" + jug0.getAmount() + "/" + jug0.getCapacity() + ")";
		s = s + " " + jug1.getJugNum() + ": (" + jug1.getAmount() + "/" + jug1.getCapacity() + ")";
		s = s + " " + jug2.getJugNum() + ": (" + jug2.getAmount() + "/" + jug2.getCapacity() + ")";
		return s;
	}
	
	/**
	 * Gets the total Number of moves it took to finish the puzzle
	 * @return moves returns the current value of moves.
	 * **/
	public int getMoves(){
		return moves;
	}
}
