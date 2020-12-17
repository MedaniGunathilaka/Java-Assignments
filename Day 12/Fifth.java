import java.util.Scanner;

public class Fifth {
   public static void main(String[] args){
       System.out.println("Enter your string: ");
       Scanner scan=new Scanner(System.in);
       String word=scan.next();
       try {
         System.out.println(word.charAt(4));
         System.out.println(word.charAt(9));
         System.out.println(word.charAt(14));
         System.out.println(word.charAt(19));
       } catch (StringIndexOutOfBoundsException e) {
           System.out.println("StringIndexOutOfBoundsException occured! "+e);
       }
}
}