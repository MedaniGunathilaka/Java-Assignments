

import java.util.*;

public class Calculator{
	
	public static void main(String args[]){
        int num1;
		int num2;
        char option;
		
	
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter  first number: ");
		num1=scan.nextInt();
		
		
		
		System.out.print("Enter  second number: ");
		num2=scan.nextInt();
		
		
		System.out.println("");

		
		System.out.print("Enter an operator <+ ,- ,/ ,*>: ");
		option = scan.next().charAt(0);
		
		
		switch(option){
				case '+':
                System.out.println( num1+" + "+num2+" = "+(num1+num2));
                break;
			
			
			
				case '-':
                System.out.println(+num1+" - "+num2+"  = "+(num1-num2));
                break;
			
			
			
				case '/':
                System.out.println(+num1+" / "+num2+"  = "+(float)num1/num2);
                break;
			
			
		
				case '*':
                System.out.println(+num1+" * "+num2+" is = "+(num1*num2));
                break;
			
			
			default:
				System.out.println("Incorrect Operator");
			}
		
	}
}


