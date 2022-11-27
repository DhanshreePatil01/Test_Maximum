package com.Bridgelabz;

public class TestMaximum<T extends Comparable<T>> {

	T x,y,z;

	public TestMaximum(T x, T y, T z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return TestMaximum.maximum(x,y,z);
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}
	
		
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of integers %s,%s and %s is--> %s\n",x,y,z,max);
	}
	
	public static void main(String[] args) {
		
		Integer xInt=7, yInt=4, zInt=5;
		
		new TestMaximum(xInt, yInt, zInt).maximum();
		
	}
}

