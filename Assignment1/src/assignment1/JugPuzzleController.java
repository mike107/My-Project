package assignment1;
import java.io.*;
import java.util.*;

/**
 * @author Michael Byun*/
/**
 * This class allows a console user to play an instance of JugPuzzle.
 */
public class JugPuzzleController {
	private static final String INVALID_INPUT_MESSAGE="Invalid number, please enter 0,1 or 2";

	private Scanner scanner;
	private JugPuzzle jugPuzzle;

	/**
	 * Constructs a new JugPuzzleController with a new JugPuzzle, ready to play with a console user.
	 */
	public JugPuzzleController(){
		scanner=new Scanner(System.in);
		jugPuzzle=new JugPuzzle();
	}

	/**
	 * FILL THIS IN (describe what this method is about)
	 * To see what good documentation looks like, look at the API documentation, 
	 * for example ArrayList (in the bottom left frame) at 
	 * http://download.oracle.com/javase/8/docs/api/
	 * this documentation was created using Javadoc. 
	 * FILL THIS IN (describe what this method is about)
	 * 
	 * This gets the move from player from which jug they want to spill from and to
	 * 
	 * @param message Displays string spill from jug or into jug
	 * @param lower   The jug to spill from
	 * @param upper   The jug to spill to
	 * @return        The current number of moves use made
	 */
	private int getMove(String message, int lower, int upper){
		int move;
		while(true){
			try {
				System.out.print(message);
				String line=scanner.nextLine();
				move=Integer.parseInt(line);
				if(lower<=move && move<=upper){
					return move;
				} else {
					System.out.println(INVALID_INPUT_MESSAGE);
				}
			}
			catch(NumberFormatException e){
				System.out.println(INVALID_INPUT_MESSAGE);
			}
		}
	}

	/**
	 * This method continuously ask users to spill from jug into another jug until the puzzle is solved. 
	 * */
	public void play(){
		while(!jugPuzzle.getIsPuzzleSolved()){
			System.out.println(jugPuzzle); // called the toString() method of jugPuzzle
			int from, to;
			from=getMove("spill from jug: ", 0,2);
			to=getMove("into jug: ",0,2);
			jugPuzzle.move(from,to);
		}
		System.out.println("Congrats you solved it in "+jugPuzzle.getMoves()+" moves!!");
	}

	public static void main(String [] args){
		JugPuzzleController jpcc=new JugPuzzleController();
		jpcc.play();
	}
}
