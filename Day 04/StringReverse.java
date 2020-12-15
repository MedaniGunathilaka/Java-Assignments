import java.util.Scanner;
 
public class StringReverse
{
 public static void main(String[] args)
 {
	 Scanner scan=new Scanner(System.in);
      System.out.println("Enter string to reverse:");
 

 String str = scan.nextLine();
 int length=str.length();
 char[] charactors=new char[length];

 
 
 for(int i = 0;i<length;i++)
 {
 charactors[i]=str.charAt(i);
 }
 while(length>0){
 
 System.out.print(charactors[length-1]);
 length--;
 }
}


}