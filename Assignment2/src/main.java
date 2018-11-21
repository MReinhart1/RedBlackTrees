import java.util.*;


// Assignment #2 CISC 235
// Michael Reinhart 20001556
// I confirm that this submission is my own work and is consistent with the Queen's regulations on Academic Integrity.
public class main {
	public static void main(String[] args) {

		//This is the code for when n = 1000
		//Sets up the variables of all the different values that can be represented 
		int maxBST1 = 0;
		int totalBST1 = 0;
		int maxRB1 = 0;
		int totalRB1 = 0;
		//List for random numbers to be inserted into the tree
		int num1[] = new int [1000];
		for(int j = 0; j < 1000; j++) {
			num1[j] = (int) Math.floor(Math.random() * 99) +1;
	}//End of the for loop
		//Loop to get 500 trials so the data can take averages which are much more accurate 
		for (int i = 0; i < 501; i++) {
			//Create two trees one is a BST and the other is a RBT both with a root value of 50
			BinaryTree BST1 = new BinaryTree((int) Math.floor(Math.random() * 99) +1);
			redBlackTree RB1 = new redBlackTree((int) Math.floor(Math.random() * 99) +1);
			//Loop through random list of values inbetween 1 and 100
			//Insert list of random numbers into the tree
			for(int k : num1 ) {
				RB1.RB_insert(RB1, k);
				BST1.insert(k);
				}
			//Adds up totals for max and total value for both trees 
			maxBST1 += BST1.max_Depth(BST1, 0);
			totalBST1 += BST1.Total_Depth(BST1, 0); 
			maxRB1 += RB1.max_Depth(RB1, 0);
			totalRB1 += RB1.Total_Depth(RB1, 0);
		}//End of outer for loop
		//Calculates the averages for all the values 
		maxBST1 = maxBST1/500;
		totalBST1 = totalBST1/500;
		maxRB1 = maxRB1/500;
		totalRB1 = totalRB1/500;
		double totRat =((double) totalBST1/totalRB1);
		double maxRat = ((double)maxBST1/maxRB1);
		//Print out all the data including ratios 
		System.out.println("These are the maxBST, totalBST, maxRB, totalRB and the BST/RB totals for num 1000:");
		System.out.println(maxBST1);
		System.out.println(totalBST1);
		System.out.println(maxRB1);
		System.out.println(totalRB1);
		System.out.println(totRat);
		System.out.println(maxRat);
		
		
		//This is the code for when n = 2000
		//It is the exact same as for when n = 1000 except for different names of 
		//the trees and values used in calculations of averages 
		int maxBST2 = 0;
		int totalBST2 = 0;
		int maxRB2 = 0;
		int totalRB2 = 0;
		int num2[] = new int [2000];
		for (int i = 0; i < 501; i++) {
			BinaryTree BST2 = new BinaryTree((int) Math.floor(Math.random() * 99) +1);
			redBlackTree RB2 = new redBlackTree((int) Math.floor(Math.random() * 99) +1);
			for(int j = 0; j < 2000; j++) {
				num2[j] = (int) Math.floor(Math.random() * 99) +1;
		}//End of the for loop
			for(int k : num2 ) {
				RB2.RB_insert(RB2, k);
				BST2.insert(k);
				}
			maxBST2 += BST2.max_Depth(BST2, 0);
			totalBST2 += BST2.Total_Depth(BST2, 0); 
			maxRB2 += RB2.max_Depth(RB2, 0);
			totalRB2 += RB2.Total_Depth(RB2, 0);
		}//End of outer for loop
		
		maxBST2 = maxBST2/500;
		totalBST2 = totalBST2/500;
		maxRB2 = maxRB2/500;
		totalRB2 = totalRB2/500;
		double totRat2 =((double) totalBST2/totalRB2);
		double maxRat2 = ((double)maxBST2/maxRB2);
		System.out.println("These are the maxBST, totalBST, maxRB, totalRB and the BST/RB totals for num 2000:");
		System.out.println(maxBST2);
		System.out.println(totalBST2);
		System.out.println(maxRB2);
		System.out.println(totalRB2);
		System.out.println(totRat2);
		System.out.println(maxRat2);
		
		
		
		//This is the code for when n = 4000
		//It is the exact same as for when n = 1000 except for different names of 
		//the trees and values used in calculations of averages 
		int maxBST4 = 0;
		int totalBST4 = 0;
		int maxRB4 = 0;
		int totalRB4 = 0;
		int num4[] = new int [4000];
		for (int i = 0; i < 501; i++) {
			BinaryTree BST4 = new BinaryTree((int) Math.floor(Math.random() * 99) +1);
			redBlackTree RB4 = new redBlackTree((int) Math.floor(Math.random() * 99) +1);
			for(int j = 0; j < 4000; j++) {
				num4[j] = (int) Math.floor(Math.random() * 99) +1;
		}//End of the for loop
			for(int k : num4 ) {
				RB4.RB_insert(RB4, k);
				BST4.insert(k);
				}
			maxBST4 += BST4.max_Depth(BST4, 0);
			totalBST4 += BST4.Total_Depth(BST4, 0); 
			maxRB4 += RB4.max_Depth(RB4, 0);
			totalRB4 += RB4.Total_Depth(RB4, 0);
		}//End of outer for loop
		
		maxBST4 = maxBST4/500;
		totalBST4 = totalBST4/500;
		maxRB4 = maxRB4/500;
		totalRB4 = totalRB4/500;
		double totRat4 =((double) totalBST4/totalRB4);
		double maxRat4 = ((double)maxBST4/maxRB4);
		System.out.println("These are the maxBST, totalBST, maxRB, totalRB and the BST/RB totals for num 4000:");
		System.out.println(maxBST4);
		System.out.println(totalBST4);
		System.out.println(maxRB4);
		System.out.println(totalRB4);
		System.out.println(totRat4);
		System.out.println(maxRat4);
		
		
		
		//This is the code for when n = 8000
		//It is the exact same as for when n = 1000 except for different names of 
		//the trees and values used in calculations of averages 
		int maxBST8 = 0;
		int totalBST8 = 0;
		int maxRB8 = 0;
		int totalRB8 = 0;
		int num8[] = new int [8000];
		for (int i = 0; i < 501; i++) {
			BinaryTree BST8 = new BinaryTree((int) Math.floor(Math.random() * 99) +1);
			redBlackTree RB8 = new redBlackTree((int) Math.floor(Math.random() * 99) +1);
			for(int j = 0; j < 8000; j++) {
				num8[j] = (int) Math.floor(Math.random() * 99) +1;
		}//End of the for loop
			for(int k : num8 ) {
				RB8.RB_insert(RB8, k);
				BST8.insert(k);
				}
			maxBST8 += BST8.max_Depth(BST8, 0);
			totalBST8 += BST8.Total_Depth(BST8, 0); 
			maxRB8 += RB8.max_Depth(RB8, 0);
			totalRB8 += RB8.Total_Depth(RB8, 0);
		}//End of outer for loop
		
		maxBST8 = maxBST8/500;
		totalBST8 = totalBST8/500;
		maxRB8 = maxRB8/500;
		totalRB8 = totalRB8/500;
		double totRat8 =((double) totalBST8/totalRB8);
		double maxRat8 = ((double)maxBST8/maxRB8);
		System.out.println("These are the maxBST, totalBST, maxRB, totalRB and the BST/RB totals for num 8000:");
		System.out.println(maxBST8);
		System.out.println(totalBST8);
		System.out.println(maxRB8);
		System.out.println(totalRB8);
		System.out.println(totRat8);
		System.out.println(maxRat8);
		
		
		
		//This is the code for when n = 16000
		//It is the exact same as for when n = 1000 except for different names of 
		//the trees and values used in calculations of averages 
		int maxBST16 = 0;
		int totalBST16 = 0;
		int maxRB16 = 0;
		int totalRB16 = 0;
		int num16[] = new int [16000];
		for (int i = 0; i < 501; i++) {
			BinaryTree BST16 = new BinaryTree((int) Math.floor(Math.random() * 99) +1);
			redBlackTree RB16 = new redBlackTree((int) Math.floor(Math.random() * 99) +1);
			for(int j = 0; j < 16000; j++) {
				num16[j] = (int) Math.floor(Math.random() * 99) +1;
		}//End of the for loop
			for(int k : num16 ) {
				RB16.RB_insert(RB16, k);
				BST16.insert(k);
				}
			maxBST16 += BST16.max_Depth(BST16, 0);
			totalBST16 += BST16.Total_Depth(BST16, 0); 
			maxRB16 += RB16.max_Depth(RB16, 0);
			totalRB16 += RB16.Total_Depth(RB16, 0);
		}//End of outer for loop
		
		maxBST16 = maxBST16/500;
		totalBST16 = totalBST16/500;
		maxRB16 = maxRB16/500;
		totalRB16 = totalRB16/500;
		double totRat16 =((double) totalBST16/totalRB16);
		double maxRat16 = ((double)maxBST16/maxRB16);
		System.out.println("These are the maxBST, totalBST, maxRB, totalRB and the BST/RB totals for num 16000:");
		System.out.println(maxBST16);
		System.out.println(totalBST16);
		System.out.println(maxRB16);
		System.out.println(totalRB16);
		System.out.println(totRat16);
		System.out.println(maxRat16);
	
		
		//This is the code for when n = 50000
		//It is the exact same as for when n = 1000 except for different names of 
		//the trees and values used in calculations of averages 
		int maxBST5 = 0;
		long totalBST5 = 0;
		int maxRB5 = 0;
		long totalRB5 = 0;
		int num5[] = new int [50000];
		for (int i = 0; i < 501; i++) {
			BinaryTree BST5 = new BinaryTree((int) Math.floor(Math.random() * 99) +1);
			redBlackTree RB5 = new redBlackTree((int) Math.floor(Math.random() * 99) +1);
			for(int j = 0; j < 50000; j++) {
				num5[j] = (int) Math.floor(Math.random() * 99) +1;
		}//End of the for loop
			for(int k : num5 ) {
				RB5.RB_insert(RB5, k);
				BST5.insert(k);
				}
			maxBST5 += BST5.max_Depth(BST5, 0);
			totalBST5 += BST5.Total_Depth(BST5, 0); 
			maxRB5 += RB5.max_Depth(RB5, 0);
			totalRB5 += RB5.Total_Depth(RB5, 0);
			
			//Used to track progress of how far along I am in the algorithm 
			if ( (i % 50) == 0) 
				System.out.println("This is where we are" + i);
		}//End of outer for loop
		
		maxBST5 = maxBST5/500;
		totalBST5 = totalBST5/500;
		maxRB5 = maxRB5/500;
		totalRB5 = totalRB5/500;
		double totRat5 =((double) totalBST5/totalRB5);
		double maxRat5 = ((double)maxBST5/maxRB5);
		System.out.println("These are the maxBST, totalBST, maxRB, totalRB and the BST/RB totals for num 50000:");
		System.out.println(maxBST5);
		System.out.println(totalBST5);
		System.out.println(maxRB5);
		System.out.println(totalRB5);
		System.out.println(totRat5);
		System.out.println(maxRat5);
	}//End of the main method
}//End of the class