import java.util.*;

public class arraySwaprowtocol{
    public static void main (String arg[]){
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        int row = 2;
        int col = 3;

        printmatrix(arr);

        int arr2[][] = new int[col][row];

        for(int i=0; i<arr.length; i++){
         for(int j = 0; j<arr[0].length; j++){
            arr2[j][i] = arr[i][j];
         }   

     }

     printmatrix(arr2);
 }

 public static void printmatrix(int arr[][]){
    System.out.println("matrix is = ");

    for(int i=0; i<arr.length; i++){
        for (int j=0; j<arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
 }
}