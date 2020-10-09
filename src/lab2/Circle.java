package lab2;

public class Circle
{
    private double radius;
    private String color;

    public Circle(double r, String c)
    {
        radius = r;
        color = c;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public String getColor()
    {
        return color;
    }

    public double getArea()
    {
        return radius*radius*Math.PI;
    }
}
