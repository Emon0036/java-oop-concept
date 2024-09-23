import java.util.ArrayList;
import java.util.Collections;

public class sort_stringValue_Integer_Value_in_assendingOrder {


    public static void main(String[] args) {
        ArrayList <String> car = new ArrayList<>();
        
        car.add("Lambor gini");
        car.add("TOYOTA");
        car.add("Tesla");
        car.add("BMW");
        Collections.sort(car);

        // for(String cr :car){
        //     System.out.println(cr);

        // }

        System.out.println(car);

        ArrayList <Integer> num = new ArrayList<>();
        
        num.add(25);
        num.add(36);
        num.add(8);
        num.add(10);
        Collections.sort(num);

        // for(Integer nm :num){
        //     System.out.println(nm);

        // }

        System.out.println(num);
    }
}
