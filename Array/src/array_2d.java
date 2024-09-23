import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a1 , a2;
        System.out.print("Enter the value of row:");
        a1  = sc.nextInt();
        System.out.print("Enter the value of colum:");
        a2 = sc.nextInt();
        int [][] arr = new int[a1][a2];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                arr [i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<a1 ; i++){
            for(int j=0 ; j<a2 ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
