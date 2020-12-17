
import java.util.Scanner;
class bodyMass{

    private double weight;
    private double height;

    public  bodyMass(){

    }

    public bodyMass(double weight, double height){
        this.weight=weight;
        this.height=height;

    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getheight(){
        return height;
    }

    public double getBmi(){
        double answer= weight/(height*height);
        return answer;
    }

}


public class BMI {

    public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your weight in kg : ");
		double weight=scan.nextDouble();
		System.out.print("Enter your height in m : ");
		double height=scan.nextDouble();
	bodyMass bmi=new bodyMass();
	bmi.setWeight(weight);
	bmi.setHeight(height);
		
       
        System.out.println("The BMI value is " +bmi.getBmi());
    }
    
}