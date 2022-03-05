package com.nse;

public class Test {
	public static void main(String[] args) {
		SingletonClass sc1=SingletonClass.getSingletonClass();
		SingletonClass sc2=SingletonClass.getSingletonClass();
		
		System.out.println(sc1.hashCode()+" "+sc2.hashCode());
	}
}
