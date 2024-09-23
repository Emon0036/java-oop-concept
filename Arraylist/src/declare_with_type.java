
import java.util.ArrayList;
import java.util.Scanner;

public class declare_with_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a1 = new ArrayList<Integer>(5);

     
        for(int i=0 ; i<5 ; i++){
           System.out.print("Enter the number of student "+(i+1)+":");
           a1.add(sc.nextInt());
        }
        int sum=0;

        System.out.print("Sum of the number of the student:");

        for(int i=0 ; i<a1.size() ; i++){
            sum += a1.get(i);
        }

        System.out.println(sum);

    }
    
}
