package lab2;

public class Main
{
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");

        c1.setRadius(5.0);

        c1.setColor("purple");

        System.out.println("Radius is " + c1.getRadius() +  " Color is " + c1.getColor() +  " Area is " + c1.getArea());

    }
}
