// Assignment #2 CISC 235
// Michael Reinhart 20001556
// I confirm that this submission is my own work and is consistent with the Queen's regulations on Academic Integrity.


public class BinaryTree {
//This is all the data included in a binary search tree
private int data;
private BinaryTree left;
private BinaryTree right;
private BinaryTree root;



//This is the constructor for the BST
//Sets the data to the value provided and the leafs to null
public BinaryTree(int num) {
root = this;
this.data = num;
this.left = null;
this.right = null;
}

//Insert function taken from class notes 
public void insert(int x) {
	 root = rec_BST_Insert(root,x);
}
	 
//Insert function taken from class notes 
public BinaryTree rec_BST_Insert(BinaryTree current,int x) {
	 if (current == null)
		 return new BinaryTree(x);
	 else if  (x > current.data)
		 current.right = rec_BST_Insert(current.right,x);
	 else
	 current.left = rec_BST_Insert(current.left,x);
	 return current;
}//End of the rec_BST_Insert method



//SearchPath function used to make sure BST is correct 
//Takes parameters as the target value to search for and a root node to the BST
//Prints out every node data value it visits on the way to finding the target value
public void SearchPath (int target, BinaryTree root){
	if (root.data != target && root.left == null && root.right == null) 
		System.out.println("This number is not in the tree");
	else {
	if (root.data == target)
		System.out.println(target);
	else if (root.data >= target) {
		System.out.println(root.data);
		SearchPath(target, root.left);
	}//End of the if else statement 
	else if (root.data <= target) {
		System.out.println(root.data);
		SearchPath(target, root.right);
	}//End of the if else statement	
	}//End of big else statement
}//End of the searchPath method


//Total_Depth method to calculate the sum of all the depths in the BST
//Parameters are the root node to a BST and a depth of 0 to keep in order to calculate sums 
//Returns an integer number that is the sum of all the depths
public int Total_Depth (BinaryTree root, int depth) {
	//If the node has both a left and right child 
	if (root.left != null && root.right != null) {
		return 1 * depth + Total_Depth(root.left, depth +1) + Total_Depth(root.right, depth +1);
	}
	//If the node has just a right child 
	if (root.left == null && root.right != null) {
		return  1 * depth + Total_Depth(root.right , depth + 1);
		}
	//If the node has just a left child
	if (root.right == null && root.left != null) {
		return  1 * depth + Total_Depth(root.left, depth + 1);
		}
	//If the node is a leaf
	if (root.right == null && root.left == null) {
		return 1 * depth;
		}
	//Should never happen (only if the tree passed in is empty)
	else 
		return -1;
}//End of the Total_Depth method

//max_Depth method that calculates the depth of the deepest point in the tree 
//Parameters are the root node to a BST and a depth of 0 to keep in order to keep the largest number
//Returns an integer which is the depth of the deepest point in the tree
public int max_Depth(BinaryTree root, int depth) {
	//If the node is a leaf
	if (root.left != null && root.right != null)
		return max_Depth(root.right, depth + 1);
	//If the node does not have a left child
	if (root.left != null)
	    return max_Depth(root.left, depth + 1);
	//if the node does not have a right child
	if (root.right != null)
		 return max_Depth(root.right, depth + 1);
	//If the node has two children 
	if (root.right == null && root.left == null)
		return 1 + depth;
	//Should never happen (only if the tree passed in is empty)
	else
		return -1;
}//End of the method
}//End of the class