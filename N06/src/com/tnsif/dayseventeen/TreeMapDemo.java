package com.tnsif.dayseventeen;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		// ordered, sorted map
		TreeMap<String, String> persons = new TreeMap<String, String>();

		persons.put("aniket@gmail.com", "Gaikwad Aniket");
		persons.put("nidhi@gmail.com", "Dhingra Nidhi");
		persons.put("lisha@gmail.com", "Sharma Lisha");
		persons.put("dhruvi@gmail.com", "Thakur Dhruvi");
		System.out.println(persons);

		// null keys are not allowed but null values are allowed
		persons.put("abc@gmail.com", null);
		//persons.put(null, "abc");
		//persons.put(null, null);
		//System.out.println(persons);

		System.out.println(persons.containsKey("lisha@gmail.com"));

		System.out.println(persons.containsValue("Lisha"));
		System.out.println("-------------------------------");
		System.out.println(persons.get("lisha@gmail.com"));

		System.out.println("-------------------------------");
		Set<Entry<String, String>> dict = persons.entrySet();
		System.out.println(dict);
		Iterator<Entry<String, String>> it = dict.iterator();
		while (it.hasNext()) {
			Entry<String, String> rec = it.next();
			System.out.println(rec.getKey() + " : " + rec.getValue());
		}
		System.out.println("-------------------------------");
		
		  Comparator<Student> comp=(s1,s2)->{ return
		  s1.getName().compareTo(s2.getName()); };
		 	
		TreeMap<Student, String> studMap=new TreeMap<Student,String>(comp);
		studMap.put(new Student(101,"Nikhil",67), "Mumbai");
		studMap.put(new Student(105,"Ketan",71), "Pune");
		studMap.put(new Student(103,"Soham",63), "Nashik");
		System.out.println(studMap);
	}

}
