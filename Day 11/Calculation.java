

package calc;
import arithmeticCalculator.*;
import java.util.Scanner;

public class Calculation{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
			
		
		
		System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
   
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
   arithmeticCalculator.SimpleArithmeticCalculator vall=new arithmeticCalculator.SimpleArithmeticCalculator();
   
 
        vall.add(num1,num2);
		vall.substract(num1,num2);
		vall.division(num1,num2);
		vall.multiplication(num1,num2);
 
 }
 
}