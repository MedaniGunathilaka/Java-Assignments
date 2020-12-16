class Maths{
    public static int doMagic(int firstNum,int secondNum){
        return firstNum+secondNum;
    }
    public static double doMagic(double firstNum,double secondNum){
        return firstNum*secondNum;
    }
}
public class MathsMagic {
    public static void main(String[] args){
        System.out.println(Maths.doMagic(10,5));
        System.out.println(Maths.doMagic(5.5,4.5));
    }
}