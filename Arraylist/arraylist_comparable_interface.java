
import java.util.ArrayList;
import java.util.Collections;


public class arraylist_comparable_interface {
    

    public static void main(String[] args) {

        ArrayList <Student> arr = new ArrayList <Student> ();

        arr.add(new Student("rakib", 4646, 22));
        arr.add(new Student("Robin", 4646, 26));
        arr.add(new Student("Risita", 4646, 20));
        arr.add(new Student("Robinson", 466, 23));

        Collections.sort(arr);

        for(int i=0 ; i<arr.size();i++){
            System.out.println("Name:"+ arr.get(i).name + "Roll:" +arr.get(i).roll + "age:"+ arr.get(i).age);
        }

        
    }
    
}


