import java.util.Scanner;
public class TimesTable{
    public static void main(String[] args){
        
        int num;
		int i=0;
        int j= 0;
        
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your number: ");
		num=input.nextInt();
		
		for(j=1;j<=10;j++)
		{
			++i;
			int answer=num*i;
			System.out.println(num + "*" + j +"=" +answer);
			
		}
	}
}