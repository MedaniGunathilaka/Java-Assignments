public class TestPerson {
    public static void main(String[] args){
        System.out.println("Details of students \n----------------");
        Student student=new Student("Mark Fernando","67, Colombo.");
        System.out.println(student.toString());
        student.addCourses("IS101",97);
        student.addCourses("IS102",68);
        student.printGrades();
        System.out.println();
        System.out.println("Details of teachers \n----------------");
        Teacher teacher=new Teacher("Lori Silva","10/A, Colombo.",12000.0);
        System.out.println(teacher.toString());
        teacher.printBaseSalary();
        teacher.addCourse("CS101");
        teacher.addCourse("CS102");
        teacher.printCourese();
    }
}
