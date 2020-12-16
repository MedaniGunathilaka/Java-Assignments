class PatternGen{
    public void generatePattern(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void generatePattern(char k){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public void generatePattern(int number){
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public void generatePattern(int number,char k){
        for(int i=1;i<=7;i++){
            for(int j=0;j<i;j++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

public class PatternMain {
    public static void main(String[] args){
        PatternGen P1=new PatternGen();
        P1.generatePattern();
        PatternGen P2=new PatternGen();
        P2.generatePattern('a');
        PatternGen P3=new PatternGen();
        P3.generatePattern(10);
        PatternGen P4=new PatternGen();
        P4.generatePattern(8,'b');


    }
}