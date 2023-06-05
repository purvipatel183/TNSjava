package Day2;
abstract class Animal{
	String name;
	int age;
	abstract void makeSound(String s);
}
class Dog extends Animal{
	Dog(String n,int a){
		name=n;
		age=a;
	}
	void makeSound(String s) {
		String sound=s;
		System.out.println("name is :"+name+" age is: "+age+" it sound like:"+sound);
	}
}
class Cat extends Animal{
	Cat(String n,int a){
		name=n;
		age=a;
	}
	void makeSound(String s) {
		String sound=s;
		System.out.println("name is :"+name+" age is: "+age+" it sound like:"+sound);
	}
}

public class Ab_Animal {

	public static void main(String[] args) {
		Dog d=new Dog("jenny",10);
		d.makeSound("bow bow");
		Cat c=new Cat("honey",6);
		c.makeSound("miu miu");

	}

}
