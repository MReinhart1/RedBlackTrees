// Assignment #2 CISC 235
// Michael Reinhart 20001556
// I confirm that this submission is my own work and is consistent with the Queen's regulations on Academic Integrity.

public class redBlackTree {

//This is all the data that is included in a red black tree
private int data;
private redBlackTree left = null;
private redBlackTree right = null;
private boolean color;
private boolean isLeaf;

//Constructor for the red black tree it sets all the data up by adding in the value given and setting up left and
//right children also sets the color to red which is false 
	redBlackTree (int num) {
		this.data = num;
        this.left = new redBlackTree(true);
        this.right = new redBlackTree(true);
        this.left.color = true;
        this.right.color = true;
		this.color = false;
		this.isLeaf = false;
	}//End of the constructor 

	
	//Method to deal with if a node is a leaf and then sets the leaf to black 
	 redBlackTree(boolean leaf){
		 this.isLeaf = true;
		 color = true;
	 }//End of the second constructor
	
	//Insert function taken from class notes 
	public void RB_insert(redBlackTree T,int x) {
		 T = rec_RB_insert(T,x);
		 T.color = true; 
	}//End of the recursive_RB_insert
	
	
	//Insert function taken from class notes 
	public redBlackTree rec_RB_insert(redBlackTree v, int x) {
		 if (v.left == null && v.right == null)
			 return new redBlackTree(x);
		 else if (v.data > x) {
		 v.left = rec_RB_insert(v.left, x);
		 if (v.left.color == true)
		     return v;
		 else {
		if ((v.left.left.color == false) || (v.left.right.color == false)) {
		if (v.left.left.color == false) 
			return Left_Left_fix(v);
		else
			return Left_Right_fix(v);
		}
		 else
		return v;
		}}
		 else { // else 1
		 v.right = rec_RB_insert(v.right,x);
		 if (v.right.color == true)
			 return v;
		 else {//else 2
		if ((v.right.left.color == false) || (v.right.right.color == false))
		if (v.right.left.color == false)
			return Right_Left_fix(v);
		else
			return Right_Right_fix(v);
		else
		return v;	
		 }//for else 2
		 }//For else 1
	}//End of the insert method
	
	//function taken from class notes 
	public redBlackTree Left_Left_fix(redBlackTree v) {
		redBlackTree P = v.left;
		redBlackTree S = v.right;
			 if (S.color == false) {
			 P.color = true;
			 S.color = true;
			 v.color = false;
			 return v;}
			 else {
			 v.left = P.right;
			 P.right= v;
			 P.color = true;
			 v.color = false;
			 return P;}		
	}//End of the Left_Left_fix method
	
	//function taken from class notes 
	public redBlackTree Left_Right_fix(redBlackTree GP) {
		redBlackTree P = GP.left;
		redBlackTree S = GP.right;
			 if (S.color == false) {
			 P.color = true;
			 S.color = true;
			 GP.color = false;
			 return GP;
			 }
			 else {
			 redBlackTree C = P.right;
			 P.right = C.left;
			 GP.left = C.right;
			 C.left = P;
			 C.right = GP;
			 C.color = true;
			 GP.color = false;
			 return C;}
	}//End of the Left_right_fix method
	
	//function taken from class notes 
	public redBlackTree Right_Left_fix(redBlackTree GP) {
		redBlackTree P = GP.right;
		redBlackTree S = GP.left;
			 if (S.color == false) {
			 P.color = true;
			 S.color = true;
			 GP.color = false;
			 return GP;
			 }
			 else {
			 redBlackTree C = P.left;
			 P.left = C.right;
			 GP.right = C.left;
			 C.right = P;
			 C.left = GP;
			 C.color = true;
			 GP.color = false;
			 return C;}
	}//End of the Left_Left_fix method
	
	//function taken from class notes 
	public redBlackTree Right_Right_fix(redBlackTree v) {
		redBlackTree P = v.right;
		redBlackTree S = v.left;
			 if (S.color == false) {
			 P.color = true;
			 S.color = true;
			 v.color = false;
			 return v;}
			 else {
			 v.right = P.left;
			 P.left= v;
			 P.color = true;
			 v.color = false;
			 return P;}	
	}//End of the Left_Left_fix method


	//SearchPath function used to make sure RBT is correct 
	//Takes parameters as the target value to search for and a root node to the RBT
	//Prints out every node data value it visits on the way to finding the target value
public void SearchPath (int target, redBlackTree root){
	if (root.data != target && root.left == null && root.right == null) 
		System.out.println("This number is not in the tree" + " and the color is: " + color);
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

//Total_Depth method to calculate the sum of all the depths in the RBT
//Parameters are the root node to a RBT and a depth of 0 to keep in order to calculate sums 
//Returns an integer number that is the sum of all the depths
//This is the same at the method in the BST class
public int Total_Depth (redBlackTree root, int depth) {
	if (root.left != null && root.right != null) {
		return depth + Total_Depth(root.left, depth +1) + Total_Depth(root.right, depth + 1);
	}
	if (root.left == null && root.right != null) {
		return depth + Total_Depth(root.right , depth + 1);
		}
	if (root.right == null && root.left != null) {
		return  depth + Total_Depth(root.left, depth + 1);
		}
	if (root.right == null && root.left == null) {
		return depth;
		}
	else 
		return -1;
}//End of the Total_Depth method

//max_Depth method that calculates the depth of the deepest point in the tree 
//Parameters are the root node to a RBT and a depth of 0 to keep in order to keep the largest number
//Returns an integer which is the depth of the deepest point in the tree
//This is the same at the method in the BST class
public int max_Depth(redBlackTree root, int depth) {
	if (root.left != null && root.right != null)
		return max_Depth(root.right, depth + 1);
	if (root.left != null)
	    return max_Depth(root.left, depth + 1);
	if (root.right != null)
		 return max_Depth(root.right, depth + 1);
	if (root.right == null && root.left == null)
		return 1 + depth;
	else
		return -1;

}//End of the method
}//End of the class 