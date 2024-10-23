package bai1_1;

public class MainCircle1 {
    public static void main(String[] args) {

        Circle1 c1 = new Circle1(3.0,"black");

        System.out.println(c1.getArea());

        Circle1 c2 = new Circle1();

        System.out.println(c2.getArea());

        Circle1 c3 = new Circle1(5, "white");

        System.out.println(c3.getArea());
        System.out.println(c3.getRadius());
    }
}
