package Abstraction;
 abstract class animal
{
void legs()
{
	System.out.println("All animals have 4 legs");
}
    abstract void sound() ;
    abstract void eat() ;
}
 class Dog extends animal
 {

	@Override
	void sound() {
		System.out.println(" Bow Bow..");
		
	}

	@Override
	void eat() {
		System.out.println("Pedegree");
	}
	 
 }
 class cow extends animal
 {

	@Override
	void sound() {
	System.out.println(" moo moo");
		
	}

	@Override
	void eat() {
		System.out.println(" Grass");
	}
	 
 }
 class absClass{
	 public static void main (String [] Args) {
		 
		 Dog d= new Dog();
		 cow c =new cow();
		 
		 d.sound(); d.eat(); d.legs();
		 c.sound(); c.eat();c.legs();
	 }
	 
 }