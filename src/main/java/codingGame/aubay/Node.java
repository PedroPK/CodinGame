package codingGame.aubay;

public class Node {
	
	// keep these​​​​​​‌​​​​‌‌‌‌​‌​‌​​​‌​‌‌‌​​‌‌ fields
	Node left, right;
	int value;
	
	public Node() {}
	
	public Node(int pValue) {
		this.value = pValue;
	}
	
	public void insert(int pValue) {
		if ( pValue != this.value ) {
			if ( pValue < this.value ) {
				Node left = this.left;
				Node newNode = insertInNewNode(pValue, left);
				if ( newNode != null ) {
					this.left = newNode;
				}
			} else {
				Node right = this.right;
				Node newNode = insertInNewNode(pValue, right);
				if ( newNode != null ) {
					this.right = newNode;
				}
			}
		}
	}
	
	public Node insertInNewNode(int pValue, Node pNode) {
		Node response = null;
		if ( pNode == null ) {
			pNode = new Node();
			pNode.value = pValue;
			response = pNode;
		} else {
			pNode.insert(pValue);
		}
		return response;
	}
	
	Node find(int pWanted) {
		Node response = null;
		
		if ( this.value == pWanted ) {
			response = this;
		} else {
			if ( this.value > pWanted && this.left != null) {
				response = this.left.find(pWanted);
			} else {
				if ( this.right != null) {
					response = this.right.find(pWanted);
				}
			}
		}
		
		return response;
	}
	
}
