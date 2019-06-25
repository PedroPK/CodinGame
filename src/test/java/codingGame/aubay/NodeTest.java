package codingGame.aubay;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testInsertRootNodeOnly() {
		Node root = new Node(9);
	}
	
	@Test
	public void testInsert_9and7() {
		// Arrange and Act
		Node root = new Node(9);
		root.insert(7);
		
		// Assert
		assertNotNull(root.left);
	}
	
	@Test
	public void testInsert_9and7and10() {
		// Arrange and Act
		Node root = new Node(9);
		root.insert(7);
		root.insert(10);
		
		// Assert
		assertNotNull(root.left);
		assertNotNull(root.right);
	}
	@Test
	public void testInsert_FullExample() {
		// Arrange and Act
		Node root = getFullExample();
		
		// Assert
		assertNotNull(root.left);
		assertNotNull(root.right);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 * 
	 * 
	 * @return
	 */
	private Node getFullExample() {
		Node root = new Node(9);
		root.insert(7);
		root.insert(5);
		root.insert(2);
		root.insert(8);
		root.insert(6);
		root.insert(13);
		root.insert(17);
		root.insert(16);
		return root;
	}
	
	@Test
	public void testInsertInNewNode() {
		fail("Not yet implemented");
	}
	
	/*
	 * Positive Tests
	 */
	
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFindRoot() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(9);
		
		assertSame(root, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_7() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(7);
		
		assertSame(root.left, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_5() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(5);
		
		assertSame(root.left.left, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_2() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(2);
		
		assertSame(root.left.left.left, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_6() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(6);
		
		assertSame(root.left.left.right, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_8() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(8);
		
		assertSame(root.left.right, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_13() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(13);
		
		assertSame(root.right, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_16() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(16);
		
		assertSame(root.right.right.left, found);
	}
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_17() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(17);
		
		assertSame(root.right.right, found);
	}
	
	// Negative Tests
	
	/**
	 * 						9
	 * 					/		\
	 * 					7		13
	 * 				/		\		\
	 * 				5		8		17
	 * 			/		\			/
	 * 			2		6			16
	 */
	@Test
	public void testFind_4() {
		// Arrange and Act
		Node root = getFullExample();
		
		Node found = root.find(4);
		
		assertNull(found);
	}

}
