package com.scst.generic;

public class Apple extends Fruit {

	public Apple(int size)
	{
		super(size);
	}
	
	public void hello() {
		System.out.println("I am an apple, with size " + getSize());

	}

}
