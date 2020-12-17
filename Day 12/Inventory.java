import java.util.Arrays;
import java.util.Scanner;
class MyException extends Exception{
    public MyException(String error){
        super(error);
    }
}
public class Inventory{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] inventory={0,0,0,0,0,0,0,0,0,0};
        int count=0;
        while(count<6){
        try{
            System.out.println(Arrays.toString(inventory));
            System.out.println("Enter action, index and quantity : ");
            String action=scan.next();
            int index=scan.nextInt();
            int quantity=scan.nextInt();
            if(!action.equals("add") && !action.equals("remove")){
                System.out.println("action");
                 throw new MyException("Invalid Action Exception Occured! :invalid_action: Invalid Action!");
            }
            else{if(index>=inventory.length){
                    throw new ArrayIndexOutOfBoundsException(index);
                }
                else{if(action.equals("add")){
                        inventory[index]=inventory[index]+quantity;
                } else if(action.equals("remove") && inventory[index]<quantity){
                        throw new MyException("Negative quantity Exception occured! :negative_quantity: Negative quantity at "+index+"!");
                    }else{inventory[index]=inventory[index]-quantity;
                    }
        }
        }
        }
        catch(MyException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured! : "+e);
        }
        count++;
    }
	}
}