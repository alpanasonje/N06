package com.tnsif.daytwentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		Stream<String> strStream=Stream.of("Nashik","Pune","Mumbai");
		strStream.forEach(System.out::println);
		System.out.println("----------------------");
		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
		System.out.println(words);
		System.out.println("----------------------");
		System.out.println("Strings in uppercase : ");
		List<String> s1 = words.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		System.out.println("----------------------");		
		words.stream().map(str->str.toLowerCase()).forEach(System.out::println);
		System.out.println(words);

		
		
		Float f[]= {12.5f,67.8f,80f,12.5f,67.8f,50f};
		Stream<Float> floatStream=Arrays.stream(f);
		System.out.println("----------------------");
		Consumer<Float> c=(n)->System.out.println("Price is "+n); 
		floatStream.forEach(c);
		System.out.println("----------------------");
		floatStream=Arrays.stream(f);
		floatStream.limit(1).forEach(c);
		System.out.println("----------------------");
		floatStream=Arrays.stream(f);
		floatStream.skip(1).forEach(c);
		System.out.println("----------------------");
		floatStream=Arrays.stream(f);
		floatStream.distinct().forEach(c);
		
		
		
		
		/*
		 * //creation of list from an array of integers List<Integer>
		 * intList=Arrays.asList(4,7,2,9); System.out.println(intList);
		 * 
		 * //create another list with squares of intList List<Integer> sqrList=new
		 * ArrayList<Integer>(); //for..each for(Integer no:intList) {
		 * sqrList.add(no*no); } System.out.println(sqrList);
		 * 
		 * //Using Stream API List<Integer> cubeList;
		 * cubeList=intList.stream().map(x->x*x*x).collect(Collectors.toList());
		 * System.out.println(cubeList);
		 * 
		 * //split-up of line 27 Stream<Integer> intStream=intList.stream();
		 * intStream=intStream.sorted(); intStream=intStream.map(x->x*x*x);
		 * cubeList=intStream.collect(Collectors.toList());
		 * //System.out.println(intStream.count()); System.out.println(cubeList);
		 * 
		 * List<String> nameList=Arrays.asList("Aniket","Nikhil","Manoj");
		 * System.out.println(nameList);
		 * 
		 * Stream<String> nameStream=nameList.stream();
		 * intStream=nameStream.map(name->name.length());
		 * cubeList=intStream.collect(Collectors.toList());
		 * System.out.println(cubeList);
		 * 
		 * //filter() //to filter only odd numbers from intList[4,7,2,9]
		 * intStream=intList.stream(); Stream<Integer> result=
		 * intStream.filter(n->n%2!=0); List rList=result.collect(Collectors.toList());
		 * System.out.println(rList);
		 * 
		 * //filter() - returns palindrome strings List<String>
		 * words=Arrays.asList("CAT","CAR","RACECAR","MADAM","SIR");
		 * System.out.println(words); Stream<String> wordsStream=words.stream();
		 * 
		 * //String str=new StringBuffer("Hello").reverse().toString();
		 * //System.out.println(str); wordsStream=wordsStream.filter(w->w.equals(new
		 * StringBuffer(w).reverse().toString()));
		 * nameList=wordsStream.collect(Collectors.toList());
		 * System.out.println(nameList); //Count number of values
		 * //System.out.println(wordsStream.count());
		 * 
		 * //passing number predicate to filter function Predicate<Integer> numbers;
		 * numbers =(no)->no%2==0;
		 * 
		 * intStream=intList.stream(); intStream=intStream.sorted();
		 * intStream=intStream.filter(numbers);
		 * sqrList=intStream.collect(Collectors.toList()); System.out.println(sqrList);
		 * 
		 * List<Student> sList=new ArrayList(); Student st=new Student(101,"Pooja",67);
		 * sList.add(st); st=new Student(104,"Nisha",71); sList.add(st); st=new
		 * Student(107,"Poonam",63); sList.add(st); st=new Student(102,"Neeta",87);
		 * sList.add(st); System.out.println(sList);
		 * 
		 * Predicate<Student> perPredicate=(stud)->stud.getPer()>=70;
		 * 
		 * Stream<Student> studStream=sList.stream();
		 * studStream=studStream.filter(perPredicate); List<Student> newList=
		 * studStream.collect(Collectors.toList());
		 * 
		 * System.out.println(newList);
		 * 
		 * //reduce() System.out.println(intList); intStream=intList.stream();
		 * Optional<Integer> sum=intStream.reduce((x,y)->x+y); System.out.println(sum);
		 */		
		
		
		
	}

}
