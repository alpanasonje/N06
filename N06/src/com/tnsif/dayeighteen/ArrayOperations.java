package com.tnsif.dayeighteen;

import java.util.Arrays;

public class ArrayOperations {
	public static <E> void display(E values[])
	{
		/*
		 * for(int i=0;i<values.length;i++) System.out.print(values[i]+"\t");
		 */
		for(E ele :values)
			System.out.print(ele+"\t");
		System.out.println();
	}
	
	public static <E extends Number> void sortArray(E values[])
	{
		Arrays.sort(values);
	}
}
