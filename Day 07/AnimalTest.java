public class AnimalTest {
    public static void main(String[] args) throws Exception {
        Cat cat=new Cat("milk", 4, "Black", "Pussy");
        cat.printName();
        System.out.println("Cat eats "+cat.getEats()+" legs");
        System.out.println("Cat has "+cat.getNoOfLegs()+" legs");
        System.out.println("Cat color is "+cat.getColor());

        Duck duck=new Duck("vegetablde", 2, 2);
        System.out.println("Duck eats "+duck.getEats());
        System.out.println("Duck has "+duck.getNoOfLegs());
        duck.quack();
    }
}
