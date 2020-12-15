
import java.util.Scanner;
public class Odd_or_Even{
    public static void main(String[] args){
        
        int numb;
		int i;
        int Even= 0;
        int Odd = 0;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of inputs: ");
		numb=input.nextInt();
		

        for(i = 1;i<=numb;i++){
			Scanner number=new Scanner(System.in);
		    System.out.println("Enter the input number"  +i);
			
			int num=number.nextInt();
            if(num%2 == 0){
                Even++;
            }else{
                Odd++;
            }
        }
        System.out.println("Number of Even Numbers: " + Even);
        System.out.println("Number of Odd Numbers: " + Odd);
    }
}
