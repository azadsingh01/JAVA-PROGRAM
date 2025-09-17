import java.util.*;

public class setIthBit{
    public static int setBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String arg[]){
        System.out.println(setBit(5,1));
    }
}