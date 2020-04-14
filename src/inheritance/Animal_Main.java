package inheritance;

public class Animal_Main {

	public static void main(String[] args) {
		 
		Dog d1 = new Dog();
		d1.whoAmI();
		
		Cat c1 = new Cat();
		c1.whoAmI();
		
		// Polymorphism example
		
		Animal a;

		a = new Animal();
		a.whoAmI();
		
		a = new Dog();
		a.whoAmI();
		
		a = new Cat();
		a.whoAmI();
		
	}

}
