
	import java.util.Scanner;
class MyException extends Exception{
    public MyException(){

    }
}
public class ExceptionHandling {
    public static void main(String[] args){
        System.out.println("Enter your number ");
        Scanner scan=new Scanner(System.in);
        try{
            int number=scan.nextInt();
            switch(number){
                case 1 : throw new ArithmeticException("/ by zero");
                case 2 : throw new NullPointerException();
                case 3 : throw new NumberFormatException(" For input stirng : \"abc\"");
                case 4 : throw new ArrayIndexOutOfBoundsException("/ by zero");
                case 5 : throw new StringIndexOutOfBoundsException(" Sting index out of range: 10");
                case 6 : throw new MyException();
                case 7 : break;
            }
            
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured! "+e);
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException occured! "+e);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException occured! "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured! "+e);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException occured! "+e);
        }
        catch(MyException e){
            System.out.println("My exception occured! MyException : My Exception");
        }

    }
}
