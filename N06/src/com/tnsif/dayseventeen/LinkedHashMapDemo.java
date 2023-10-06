package com.tnsif.dayseventeen;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// ordered, unsorted map
		LinkedHashMap<String, String> persons = new LinkedHashMap<String, String>();

		persons.put("aniket@gmail.com", "Aniket");
		persons.put("nidhi@gmail.com", "Nidhi");
		persons.put("lisha@gmail.com", "Lisha");
		persons.put("dhruvi@gmail.com", "Dhruvi");
		System.out.println(persons);

		persons.put("lisha@gmail.com", "Lisha Sharma");
		System.out.println(persons);
		// null keys and values are allowed
		persons.put("abc@gmail.com", null);
		persons.put(null, "abc");
		persons.put(null, null);
		System.out.println(persons);

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
		
		
		LinkedHashMap<Student, String> studMap=new LinkedHashMap<Student,String>();
		studMap.put(new Student(101,"Nikhil",67), "Mumbai");
		studMap.put(new Student(105,"Ketan",71), "Pune");
		studMap.put(new Student(103,"Soham",63), "Nashik");
		System.out.println(studMap);
	}

}
