public class Circle1 {
    private double radius;
    public String color;

    Circle1() {
        radius = 1.0;
        color = "red";
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}

