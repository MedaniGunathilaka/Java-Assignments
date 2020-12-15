import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
		int marks;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your mark: ");
		marks=input.nextInt();
		
		String grade=marks<50 ? "F"  :  (marks>=75 ? "A" : "B" );
		System.out.println(grade);
	}
}
