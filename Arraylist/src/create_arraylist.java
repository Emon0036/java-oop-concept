import java.util.*;

public class create_arraylist{
    public static void main(String[] args) {
        
        ArrayList<Object> a = new ArrayList<>(); // declare without type

        a.add("Abc");
        a.add(58);
        a.add(5.21);

        for(int i=0 ; i<a.size(); i++){
            System.out.println(a.get(i));
        }

    }
}