import java.util.*;
public class clearBitinRange{
    public static int clearBit(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (i<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main (String gs[]){
        System.out.println(clearBit(10, 2, 4));
    }
}