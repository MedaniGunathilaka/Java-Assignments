public class ShapeMain{
    public static void main(String[] args) {

        Shape R1= new Rectangle(15.5,10.1);
        System.out.println(R1.getArea());

        Shape T1= new Triangle(10.5,5.5);
        System.out.println(T1.getArea());

        Circle C1=new Circle(7.7);
        System.out.println(C1.getArea());



    }
}

class Shape{

    public double getArea(){
           
        return 0;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;


    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
  
    public void setWidth(double width) {
        this.width = width;
    }
   
    public void setLength(double length) {
       this.length=length;
    }
    
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    
    public double getArea() {
      return width * length; 
    }
  

        
    }

    class Triangle extends Shape{
        private double base;
        private double height;
    
    
        public Triangle(double base, double height){
            this.base=base;
            this.height=height;
        }
      
        public void setBase(double base) {
            this.base =base;
        }
       
        public void setheight(double height) {
           this.height=height;
        }
        
        public double getBase() {
            return base;
        }
        public double getHeight() {
            return height;
        }
        
        public double getArea() {
          return (base* height)/2; 
        }
      
    
            
        }
    
        class Circle extends Shape{
            private double radius;
            private static final double pi=3.14;
         
            public Circle(double radius){
                this.radius=radius;
            }
           
            public double getArea(){
                return pi*radius*radius;
            }
        }

