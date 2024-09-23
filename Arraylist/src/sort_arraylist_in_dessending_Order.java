import java.util.ArrayList;
import java.util.Collections;

public class sort_arraylist_in_dessending_Order {
    public static void main(String[] args) {
        ArrayList <String> car = new ArrayList<>();
        
        car.add("Lambor gini");
        car.add("TOYOTA");
        car.add("Tesla");
        car.add("BMW");

        System.out.println("Before sort:");
        for(int i=0 ; i<car.size();i++){
            System.out.println(car.get(i));
        }
        Collections.sort(car,Collections.reverseOrder());
        System.out.println("After sort:");

        for(int i=0 ; i<car.size();i++){
            System.out.println(car.get(i));
        }

        ArrayList <Integer> num = new ArrayList<>();
        
        num.add(25);
        num.add(36);
        num.add(8);
        num.add(10);
        System.out.println("Before sort:");
        for(int i=0 ; i<num.size();i++){
            System.out.println(num.get(i));
        }


        Collections.sort(num , Collections.reverseOrder());

        System.out.println("After sort:");

        for(int i=0 ; i<num.size();i++){
            System.out.println(num.get(i));
        }




      
    }
    
}
