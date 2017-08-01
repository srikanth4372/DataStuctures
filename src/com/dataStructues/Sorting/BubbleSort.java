package com.dataStructues.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	
	private static Integer[] sort(Integer[] array) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int temp;
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length-i-1; j++) {
				
				if (array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag=true;
				}
			}
			if(!flag) {break;}
		}
		
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {5, 1, 6, 2, 4, 3};
		System.out.println("BeforeSorting::"+Arrays.toString(array));
		System.out.println("AfterSorting:::"+ Arrays.toString(sort(array)));

	}

}
