package Tree;

public class TreeLinkedList {
	
	class node{
		int data;
		node right;
		node left;
		
		node(){
			this.data = data;
		}
	}
	
	node root;
	
	void preOrder(node root1) {
		
		if (root1==null) {
			throw new IllegalAccessError();
		}
		System.out.println(root1.data);
		preOrder(root1.left);
		preOrder(root1.right);		
	}
}
