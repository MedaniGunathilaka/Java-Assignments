abstract class Shapes{
    protected String color;
    protected boolean filled;
    protected Shapes(){

    }
    protected Shapes(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public abstract double calArea();
    public abstract String toString();

}
class Triangle extends Shapes{
    private double base;
    private double height;

    public Triangle(){

    }
    public Triangle(String color,boolean filled,double base,double height){
        super(color,filled);
        this.base=base;
        this.height=height;
    }
    @Override
    public double calArea(){
        return (base*height)/2;
    }
    @Override
    public String toString(){
        return "Triangle color is "+super.color+" filled is "+super.filled+" area is "+calArea();
    }
}
class Rectangle extends Shapes{
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(String color,boolean filled,double width,double height){
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    @Override
    public double calArea(){
        return width*height;
    }
    @Override
    public String toString(){
        return "Rectangle color is "+super.color+" filled is "+super.filled+" area is "+calArea();
    }
}
class Circle extends Shapes{
    private double radius;

    public Circle(){

    }
    public Circle(String color,boolean filled,double radius){
        super(color,filled);
        this.radius=radius;
        
    }
    @Override
    public double calArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "Circle color is "+super.color+" filled is "+super.filled+" area is "+calArea();
    }
}
public class Main1{
    public static void main(String[] args){
        Circle circle=new Circle("magenta",true,7);
        System.out.println(circle.toString());

        Rectangle rectangle=new Rectangle("magenta",false,9,20.5);
        System.out.println(rectangle.toString());

        Triangle triangle=new Triangle("magenta",true,14,16);
        System.out.println(triangle.toString());

    }
}