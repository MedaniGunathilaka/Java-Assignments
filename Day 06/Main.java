class Person{
    private int nic;
    private String name;
    private double height;
    private double weight;
    private int salary;

    public Person(int nic,String name,double height,double weight,int salary){
        setPersonalDetails(nic,name,height,weight,salary);
    }
    public void setPersonalDetails(int nic,String name,double height,double weight,int salary){
        this.nic=nic;
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.salary=salary;
    }

    public void showPersonalDetails(){
        System.out.println("Nic "+nic);
        System.out.println("Name "+name);
        System.out.println("Height "+height);
        System.out.println("Weight "+weight);
        System.out.println("Salary "+salary);
    }
}
public class Main {
    public static void main(String[] args){
        Person p1=new Person(12345,"Anne",5.2,45.8,0);
        p1.showPersonalDetails();
        System.out.println();

        p1=new Person(23456,"Bob",6.5,57.6,0);
        p1.showPersonalDetails();
        System.out.println();

        Person p2=new Person(34567,"Cindy",4.8,45.1,0);
        p2.showPersonalDetails();

        
    }
}