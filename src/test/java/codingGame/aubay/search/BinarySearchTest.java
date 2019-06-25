package codingGame.aubay.search;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testExists() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetIntermediaryIndex_EmptyArray() {
		// Arrange
		int[] emptyArray = new int[] {};
		
		// Act
		int intermediatyIndex = BinarySearch.getIntermediaryIndex(emptyArray);
		
		// Assert
		assertEquals(0, intermediatyIndex);
	}
	
	@Test
	public void testGetIntermediaryIndex_OneElementArray() {
		// Arrange
		int[] emptyArray = new int[] {0};
		
		// Act
		int intermediatyIndex = BinarySearch.getIntermediaryIndex(emptyArray);
		
		// Assert
		assertEquals(0, intermediatyIndex);
	}
	
	@Test
	public void testGetIntermediaryIndex_TwoElementArray() {
		// Arrange
		int[] emptyArray = new int[] {0, 1};
		
		// Act
		int intermediatyIndex = BinarySearch.getIntermediaryIndex(emptyArray);
		
		// Assert
		assertEquals(1, intermediatyIndex);
	}
	
	@Test
	public void testGetIntermediaryIndex_ThreeElementArray() {
		// Arrange
		int[] emptyArray = new int[] {0, 1, 2};
		
		// Act
		int intermediatyIndex = BinarySearch.getIntermediaryIndex(emptyArray);
		
		// Assert
		assertEquals(1, intermediatyIndex);
	}
	
	@Test
	public void testGetIntermediaryIndex_FourElementArray() {
		// Arrange
		int[] emptyArray = new int[] {0, 1, 2, 3};
		
		// Act
		int intermediatyIndex = BinarySearch.getIntermediaryIndex(emptyArray);
		
		// Assert
		assertEquals(2, intermediatyIndex);
	}

}
