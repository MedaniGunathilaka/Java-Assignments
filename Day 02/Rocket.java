import java.util.Scanner;
public class Rocket{
public static void main(String[] args){

	final float g=9.8F;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the total mass");
	float mass=scan.nextFloat();
	System.out.println("Enter the total thrust");
	float thrust=scan.nextFloat();
	float forwardTrust=thrust-mass*g;
	float acceleration=forwardTrust/mass;
	System.out.println("Acceleration is " +acceleration+"ms^(-2)");


	}
}
