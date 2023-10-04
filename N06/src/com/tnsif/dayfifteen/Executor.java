//Program to demonstrate heterogeneous list
package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Executor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List listOne=new ArrayList();
		listOne.add(10);
		listOne.add("Hello");
		listOne.add(67.80f);
		listOne.add(false);
		listOne.add(new Date());
		System.out.println(listOne);
		
		Collections.sort(listOne);
		
	}

}
