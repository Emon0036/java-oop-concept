public class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
         radius = 1;
    }

    public double getRadius(){
        return 2*3.1416*radius;
    }
}

class Mainn{
    public static void main(String[] args) {
       Circle c1 = new Circle(2.0);
       Circle c2 = new Circle(12);
       Circle c3 = new Circle(24);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c3.getRadius());

    }
}