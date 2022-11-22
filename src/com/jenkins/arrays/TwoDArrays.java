package com.jenkins.arrays;

import java.util.Arrays;
import java.util.Iterator;

import org.w3c.dom.ls.LSOutput;

public class TwoDArrays {
	/**
	 * Row major traversal 
	 * gives us the ability to traverse a 2d array 
	 * stepping through each row and each column then moving to the next row until the end og the 2d array 
	 * 
	 * @param a
	 */
	public static void rowMajorTraversal(int[][] a) {
		//Get the rows and columns sizes 
		int rows = a.length;
		int columns = a[0].length;
		System.out.println("\nRow Major Traversal\n");
		for(int i=0; i <rows; i++) {
			for(int j=0; j <columns; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		
	}
	
	/**
	 * Column Major traversal 
	 * Traverses the 2d array down each column of every row then moves the next column
	 * @param a
	 */
	public static void columnMajorTraversal(int [][] a) {
		int rows = a.length;
		int columns = a[0].length;
		System.out.println("\nColumn Major Travseral\n");
		for(int i=0; i <columns; i++) {
			for(int j=0; j < rows; j ++) {
				System.out.println(a[j][i]);
			}
		}
		
		
	}
	
	/**
	 * For each, traverses the array in the same way
	 * But will iterate through every single index
	 * @param a
	 */
	public static void forEachTraversal(int [][]a ) {
		System.out.println("\nFor each traversal\n");
		for(int[] row: a ) {
			for(int i: row) {
				System.out.println(i);
				
			}
		}
		
	}
	
	public static void whileLoopTraversal(int [][]a) {
		System.out.println("\nWhile loop Traversal\n");
		int rows = a.length;
		int columns = a[0].length;
		
		int i = 0;
		int j = 0;
		
		while(i < rows) {
			j =0;
			while(j < a[i].length) {
				System.out.println(a[i][j]);
				j ++;
			}
			i++;
		}
		
		
	}
	public static void main(String[] args) {

		int[][] numMatrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		rowMajorTraversal(numMatrix);
		
		columnMajorTraversal(numMatrix);
		
		forEachTraversal(numMatrix);
		
		whileLoopTraversal(numMatrix);
		}
	}

