import java.util.*;

public class arraySum2row{
    public static void main (String arg[]){
        int arr[][] = {{4, 5, 6,}, {7, 8, 9},{1, 2, 3}};
        int sum = 0;

       
            for (int j=0; j<arr[0].length; j++){

                 sum += arr[1][j];

            }
        
        System.out.print("sum of 2line in array =" + sum);
    }
}