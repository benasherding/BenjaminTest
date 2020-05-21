package com.ben.git.test;






class Animal {
	void anim() {
		System.out.println("I am animated"); //class animal
	}
	
}


class FarmAnimal extends Animal{
	void info() {
		System.out.println("I live in a farm"); //class farm animal
	}
	
	
}



class Fish extends SeaCreature{
	
	void info() {
		System.out.println("I don't sing, I can swim"); //classfish
		// not all fishes don't walk
		
	}
	
	
	
	
	
	

	

}


class SeaCreature extends Animal {
	
	void info() {
		System.out.println("I live in the sea"); //class seacreature
		//sea 
		
		
	}
	
	
	
	
	
}






class Shark extends Fish {
	void info() {
		System.out.println("I don't sing, don't walk, don't swim"); //class shark
		System.out.println("I am grey");
		//sharks don't all eat other fishes
		//sharks are not all large
		
		
	}
	
	
	
	
	
}

class Clownfish extends Fish {
	
	void info() {
		System.out.println("I make jokes"); //class clownFish
		System.out.println("I am small and colourful");
		//not all clownfish are funny
		
		
	}
	
	
	
	
	
}



class Whale extends SeaCreature {
	
	void info() {
		System.out.println("I am whaley"); //Class Whale
		
		
	}
	
	
	
	
	
}









class dolphin extends Whale {
	
	void info() {
		System.out.println("I am amazing"); //Class Dolphin
		
		
		
		
	}
	
	
	
	
	
}









class Bird extends Animal {
	
	void info() {
		
		System.out.println("I can walk");
		
	}
	
	
	
	

	void wing() {
		System.out.println("I have wings");
	}
	
	void sing() {
		System.out.println("I am Singing");
	}
}



class Flightless_Bird extends Bird{
	
	void info() {
		System.out.println("I cannot fly");
	}
	
	
	
	
}


class Flight_Bird extends Bird{
	
	void info() {
		System.out.println("I can fly");
	}
	
	
	
	
}


class Swim_Bird extends Bird{
	
	void info() {
		System.out.println("I am good at swimming~");
	}
	
	
	
	
}

class Parrot extends Flight_Bird {
	Dog woof;
	Cat meow;
	Rooster sound;
	
	
	
	void info() {
		System.out.println("I am good at copy cat sounds.");
		
		
		
	}
	
	
	
}







class Duck extends Swim_Bird {
	void info() {
		System.out.println("I can swim~");
	}
	
	void sing() {
	System.out.println("Quack Quack");
	}
	
	
}
class Chicken extends Flightless_Bird{
	void sing() {
		System.out.println("Cluck cluck");
	}
	
	
	
}




//reusing codes fly and cannot fly, swim cannot swim
//reusing codes cock-adoodle.. meow, woof woof,
//






/*
 * class Rooster extends Chicken{
 * 
 * 
 * 
 * void sing() { System.out.println("Cock-a-doodle-doo");
 * System.out.println("I am a male Chicken"); }
 * 
 * 
 * 
 * 
 * }
 * 
 */



/*
 * class Rooster{ Rooster rooster;
 * 
 * void sing(rooster) { this.rooster = rooster;
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */















public class Solution {
	public static void main(String[] args) {
		
		
		
		Bird bird = new Bird();
		bird.anim();
		bird.wing();
		bird.sing();
		Duck duck = new Duck();
		Chicken chicken = new Chicken();
		duck.sing();
		chicken.sing();
		
	}

}
