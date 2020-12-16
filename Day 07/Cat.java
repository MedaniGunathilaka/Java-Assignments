public class Cat extends Animal{
    private String color;
    private String name;

    public Cat(String food,int legs){
        setEats(food);
        setNoOfLegs(legs);
    }
    public Cat(String food,int legs,String color,String name){
        setEats(food);
        setNoOfLegs(legs);
        this.color=color;
        this.name=name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void printName(){
        System.out.println("Name of the cat is "+name);
    }
}