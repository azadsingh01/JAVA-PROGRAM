import java.util.*;

public class arraynoCount{
    public static void main (String arg[]){
        int arr[][] = {{4, 7, 8, }, {8, 8, 7}};
        int count7 =0;

        for(int i=0; i<arr.length; i++ ){
            for (int j=0; j<arr[0].length; j++){
                if (arr[i][j] == 7){
                    count7++;
                }

            }
        }
          System.out.print(" 7 if found at ="+ count7);
    }
}