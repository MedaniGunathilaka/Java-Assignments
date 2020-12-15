import java.util.Arrays;
import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random= new Random();
        for (int i=0; i<5; i++){
            int randomnumber= random.nextInt(100);
            if (randomnumber<50)
            {
                System.out.println(randomnumber +":"  + "low");
            }
            else
            {
                System.out.println(randomnumber +":"  + "high");
            }

        }


    }

    
}