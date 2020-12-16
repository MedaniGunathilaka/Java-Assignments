
public class Teacher extends Person {
    private int numCourse=2;
    private String[] courses=new String[numCourse];
    private int maxCourses;
    private double baseSalary;
    private int i=0;


    public Teacher(String name,String address){
        setName(name);
        setAddress(address);
    }
    public Teacher(String name,String address,double salary){
        setName(name);
        setAddress(address);
        this.baseSalary=salary;
    }
    public void addCourse(String course){
        courses[i]=course;
        i++;
    }
    public void printCourese(){
        for(int i=0;i<2;i++){
            System.out.println("Course "+courses[i]+" assigned");
        }
    }
    public void setBaseSalary(double salary){
        this.baseSalary=salary;
    }
    public void printBaseSalary(){
       System.out.println("BaseSalary: "+baseSalary); 
    }
}