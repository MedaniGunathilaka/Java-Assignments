	import java.util.Scanner;
	public class Calc{
		public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			double A;
			double B;
			
			while(true){
		System.out.println("Enter the first number (A)");
	A=scan.nextInt();
	if(A>0)
	break;
	else
	   System.out.println("A should be greater than 0");
	
	
	}
	
			while(true){
				System.out.println("Enter the second number (B)");
				B=scan.nextInt();
				if(B>0)
					break;
					else
				System.out.println("B should be greater than 0");
			}
	 System.out.println("A+B="+(int)(A+B));
	 System.out.println("A-B="+(int)(A-B));
	 System.out.println("A*B="+(int)(A*B));
	 System.out.println("A/B="+(A/B));
	
	
	
	}
	
	}