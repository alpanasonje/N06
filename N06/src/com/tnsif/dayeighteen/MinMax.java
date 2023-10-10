//Program to demonstrate generic interface
package com.tnsif.dayeighteen;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T getMinimum();

	T getMaximum();
}

