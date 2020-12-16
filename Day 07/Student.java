public class Student extends Person {
    private int numCourses=2;
    private String[] courses=new String[numCourses];
    private int[] grades=new int[numCourses];
    private int maxCourses;
    private int i=0;

    public Student(String name,String address){
        setName(name);
        setAddress(address);
    }
    public void addCourses(String course,int grade){
        courses[i]=course;
        grades[i]=grade;
        i++;
    }
    public void printGrades(){
        for(int i=0;i<numCourses;i++){
            System.out.println("Course "+courses[i]+": Grade : "+grades[i]);
        }
    }
}