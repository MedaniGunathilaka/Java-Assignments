public class AnimalMain{
    public static void main(String[] args) {

        Animal Padfoot=new Dog();
        Padfoot.makeSound();

        Animal Crookshanks=new Cat();
        Crookshanks.makeSound();

    }
}


class Animal{
    public void makeSound(){

    }

}

class Cat extends Animal{

    public void makeSound(){

        System.out.println("Meow");


    }

}


class Dog extends Animal{

    public void makeSound(){

        System.out.println("Woof");
        

    }

}

