//Program to demonstrate generic interface
package com.tnsif.dayeighteen;

//Generic Class implements Generic Interface (MinMax)
public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	T[] values;

	// Generic Constructor
	MinMaxImpl(T[] obj) {
		values = obj;
	}

	// Generic method
	@Override
	public T getMinimum() {
		T min = values[0];

		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(min) < 0)
				min = values[i];
		return min;
	}

	// Generic method
	@Override
	public T getMaximum() {
		T max = values[0];
		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(max) > 0)
				max = values[i];
		return max;
	}
}