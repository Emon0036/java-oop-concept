import java.util.ArrayList;

public class Add_element {
    public static void main(String[] args) {
        ArrayList <Object> a3 = new ArrayList<>();

        a3.add("Amaro porano jaha cay");
        a3.add("tumi");
        a3.add("Tuma chara a jogote mor kaho nai kichu nai go");


    //     a3.add(2,2564); // to add element on contains array after add element the size of the array has been updated
    //     System.out.println(a3.get(3));

    //     for(int i=0 ; i<a3.size();i++){
    //         System.out.println("Index "+(i+1)+":"+a3.get(i));

    //     }


    //    System.out.println();
    //     //Set element

    //     a3.set(2,"Dube dube valobasi");
    //     for(int i=0 ; i<a3.size();i++){
    //         System.out.println("Index "+(i+1)+":"+a3.get(i));

    //     }


    //     // remove element at from the array
    //    System.out.println();

    //     a3.remove(0);

    //     for(int i=0 ; i<a3.size();i++){
    //         System.out.println("Index "+(i+1)+":"+a3.get(i));

    //     }

        boolean ans = a3.contains("tumi"); // contains wants exact matching value

       
      System.out.println(ans);

        
    }
    
}
