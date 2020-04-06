package BinarySearchTree;

public class Demo {
public static void main(String[] args) {
	BinarySearchTree btree = new BinarySearchTree();
	btree.createBinaryTree();
	btree.displayTree();
	btree.search(10);
	//btree.inorder();
	btree.min();
	btree.max();
	
}
}
