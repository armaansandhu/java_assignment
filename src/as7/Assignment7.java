package as7;

abstract class Fruit{
	
	abstract void eat();
}

class Apple extends Fruit{
	
	@Override
	void eat() {
		System.out.print("Taste is Sweet\n");	
	}
}

class Orange extends Fruit{
	
	@Override
	void eat() {
		System.out.print("Taste is Sour\n");	
	}
}
public class Assignment7 {
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		apple.eat();
		orange.eat();
	}
}
