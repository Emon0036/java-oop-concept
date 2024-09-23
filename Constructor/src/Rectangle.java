import java.util.Scanner;

public class Rectangle {
    int length;
    int width;

    public int CalculateArea(int length , int width){
        this.length = length;
        this.width = width;
        return length * width;

    }

    public int CalculatePerimeter(int length , int width){
        this.length = length;
        this.width = width;

        return 2*(length + width);

    }
}







class TestRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("Enter dimensions of rectangle:");
        System.out.println("Please enter a choice: 1. Area of rectangle. 2. Perimeter of rectangle.");
        a = sc.nextInt();
        Rectangle b = new Rectangle();


        if(a == 1){
           int area= b.CalculateArea(25 , 65);
            System.out.println("Area=" + area);
        }
        else if(a == 2){
            int perimeter = b.CalculatePerimeter(58 , 65);
            System.out.println("Perimeter:" + perimeter);
        }



    }
}