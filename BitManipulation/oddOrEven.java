import java.util.*;

public class oddOrEven{
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) ==0 ){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String arg[]){
        oddEven(3);
        oddEven(4);
        oddEven(5);

    }
}