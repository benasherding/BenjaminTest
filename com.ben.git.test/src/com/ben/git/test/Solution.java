package com.ben.git.test;






class Animal {
	void walk() {
		System.out.println("I am walking");
	}
	
}

class Bird extends Animal {
	

	void fly() {
		System.out.println("I am flying");
	}
	
	void sing() {
		System.out.println("I am Singing");
	}
}


class Duck extends Bird {
	void sound() {
		System.out.println("Quack Quack");
		System.out.println("I can swim~");
	}
	
	
	
}
class Chicken extends Bird{
	void sound() {
		System.out.println("Cluck cluck");
		System.out.println("I cannot fly");
	}
	
	
	
}




//reusing codes fly and cannot fly, swim cannot swim
//reusing codes cock-adoodle.. meow, woof woof,
//






/*
 * class Rooster extends Chicken{
 * 
 * void sound() { System.out.println("Cock-a-doodle-doo");
 * System.out.println("I am a male Chicken"); }
 * 
 * 
 * 
 * 
 * }
 * 
 */



public class Solution {
	public static void main(String[] args) {
		
		
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		Duck duck = new Duck();
		Chicken chicken = new Chicken();
		duck.sound();
		chicken.sound();
		
	}

}
