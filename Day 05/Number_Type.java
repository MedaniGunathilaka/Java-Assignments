import java.util.Scanner;
public class Number_Type{
    public static void main(String[] args){
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your number: ");
		num=input.nextInt();
		
		if(num%25==0 && num%100!=0){
			System.out.println("Type A");
			}
		else if(num%4==0 && num%128!=0){
			System.out.println("Type B");
			}
		else{
		System.out.println("Not type A and B");	
			
		}	
	}
}