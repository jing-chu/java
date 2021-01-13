import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //WallArea
//        WallArea wall = new WallArea(5,4);
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-9);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());
//
//        WallArea smallWall = new WallArea();
//        System.out.println("height= " + smallWall.getHeight());

        //Point
//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println("(2,2): " + first.distance(2,2));
//        System.out.println("(0,0): " + first.distance());
//        System.out.println("(second): " + first.distance(second));
//        Point point = new Point();
//        System.out.println("(): " + point.distance(6,5));

        //Floor
        //Carpet
        //Calculator
//        Floor floor = new Floor(2.75,4.0);
//        Carpet carpet = new Carpet(3.5);
//        Calculator calculator = new Calculator(floor,carpet);
//        System.out.println(calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4,4.5);
//        calculator = new Calculator(floor,carpet);
//        System.out.println(calculator.getTotalCost());

        //ComplexNumber
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("complex number is: " + one.getReal() + " + " + one.getImaginary() + "i");
        one.subtract(number);
        System.out.println("complex number is: " + one.getReal() + " + " + one.getImaginary() + "i");
        number.subtract(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());

    }
}
