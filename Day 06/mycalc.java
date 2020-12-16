import java.util.*;
public class mycalc {
	int num1, num2;
	float ans;
	
	public static void main(String args[]){
		
		mycalc c= new mycalc();
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		c.num1=scan.nextInt();
		
		System.out.println("");
		
		System.out.println("Enter the second number: ");
		c.num2=scan.nextInt();
		
		System.out.println("");
		
		c.addition();
		c.substract();
		c.mult();
		c.divide();
	}
	
	void addition(){
		ans=num1+num2;
		System.out.println("Addition of the two numbers is: "+ans);
		System.out.println("");
	}
	void substract(){
		ans=num1-num2;
		System.out.println("Sustraction of the two numbers is: "+ans);
		System.out.println("");
	}
	void mult(){
		ans=num1*num2;
		System.out.println("Multiplication of the two numbers is: "+ans);
		System.out.println("");
	}
	void divide(){
		ans=num1/num2;
		System.out.println("Division of the two numbers is: "+ans);
		System.out.println("");
	}
	
}