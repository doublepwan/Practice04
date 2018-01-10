package com.javaex.problem05;

import com.javaex.problem04.Bird;

public class SoundApp {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());
	}

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
