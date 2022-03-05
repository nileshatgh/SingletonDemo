package com.nse;

public class SingletonClass {
	private static SingletonClass singletonClass;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getSingletonClass() {
		if (singletonClass==null)
		{
			singletonClass = new SingletonClass();
		}
		return singletonClass;
		
	}
}
