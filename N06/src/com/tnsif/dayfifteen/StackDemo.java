package com.tnsif.dayfifteen;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>(); 
		st.add(30);
		st.add(70);
		st.add(20);
		st.add(90);
		st.add(10);
		System.out.println("Size of statck : "+st.size());
		System.out.println("Element to be remobve first : "+st.peek());
		System.out.println("---------------------------");
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
		System.out.println("Size of statck : "+st.size());
	}

}
