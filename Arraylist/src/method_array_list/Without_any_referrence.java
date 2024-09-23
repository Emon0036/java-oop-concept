package method_array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Without_any_referrence {
    public static void main(String[] args) {

        ArrayList <Student> arr = new ArrayList <Student> ();

        arr.add(new Student("rakib", 4646, 25));
        arr.add(new Student("Robin", 4646, 25));
        arr.add(new Student("Risita", 4646, 25));
        arr.add(new Student("Robinson", 466, 25));

        Collections.sort(arr);

        for(int i=0 ; i<arr.size();i++){
            System.out.println(arr);
        }

        
    }
    
}
