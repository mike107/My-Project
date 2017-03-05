package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JugPuzzleTest {

	JugPuzzle jugpuzzle = new JugPuzzle();
	@Test
	public void testMove() {
		assertEquals("First move",1,jugpuzzle.move(0, 1) );
		assertEquals("Second Move", 2, jugpuzzle.move(0, 0));
		assertEquals("Third Move", 3, jugpuzzle.move(1, 2));
		assertEquals("Fourth Move", 4, jugpuzzle.move(2, 0));
		assertEquals("Fifth Move", 5, jugpuzzle.move(2, 1));
	}

	@Test
	public void testGetIsPuzzleSolved() {
		Jug jugtest0 = new Jug(0);
		Jug jugtest1 = new Jug(1);
		assertEquals("Puzzle is not solve", false, jugpuzzle.getIsPuzzleSolved());
		jugtest1.setAmount(4);
		jugtest0.setAmount(4);
		assertFalse("Puzzle is solved", jugpuzzle.getIsPuzzleSolved());
	}

	@Test
	public void testToString() {
		String expected = "0  0: (8/8) 1: (0/5) 2: (0/3)";
		assertEquals("Testing toString", expected, jugpuzzle.toString());
		jugpuzzle.move(0,1);
		expected = "1  0: (3/8) 1: (5/5) 2: (0/3)";
		assertEquals("Testing toString", expected, jugpuzzle.toString());
		jugpuzzle.move(1,2);
		expected = "2  0: (3/8) 1: (2/5) 2: (3/3)";
		assertEquals("Testing toString", expected, jugpuzzle.toString());
	}
	
	


}
