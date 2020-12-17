import java.util.Scanner;
class MyException extends Exception{

}
public class Calc{
    public static void main(String[] args){
        System.out.println("Enter number 1,number 2 and operator");
        try{
            Scanner scan=new Scanner(System.in);
            int number1=Integer.parseInt(scan.next());
            int number2=Integer.parseInt(scan.next());
            char operator=scan.next().charAt(0);
            if(operator =='+' || operator =='-' || operator =='*' || operator =='/'){
                    if(operator=='+')
                        System.out.println(number1+number2);
                    else if(operator == '/'){
                        try{
                            System.out.println(number1/number2);
                        }
                        catch(ArithmeticException e){
                            System.out.println("Arithmetic exception occured! : "+e);
                        }
                    }
                    else if(operator=='-'){
                        try{
                            if(number1>number2)
                                System.out.println(number1-number2);
                            else throw new MyException();
                        }
                        catch(MyException e){
                            System.out.println("Negative result exception occured! :negative_result: Negative Results!");
                        }
                    }
                    else System.out.println(number1*number2);

                  
                } 
                else {
                    throw new MyException();
                }      
            
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception occured! : "+e);
        }
        catch(MyException e){
            System.out.println("Invalid Operator Exception Occured! :invalid_operator:Invalid Operator");
        }
 
}
}