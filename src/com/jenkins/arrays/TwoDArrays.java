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
	public static void main(String[] args) {

		int[][] numMatrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		rowMajorTraversal(numMatrix);
		
		columnMajorTraversal(numMatrix);
		}
	}

