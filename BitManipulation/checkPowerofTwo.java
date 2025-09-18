import java.util.*;
public class checkPowerofTwo{
    public static boolean checkPowerTwo(int n){
        boolean bitMask = (n & (n-1)) == 0;
        return bitMask;
    }
    public static void main(String args[]){
        System.out.println(checkPowerTwo(8));
    }
}