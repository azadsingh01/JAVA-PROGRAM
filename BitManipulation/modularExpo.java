public class modularExpo{
    public static long powMod(long a, long n, long x){
        long ans = 1;
        a = a%x;
        while(n>0){
            if((n&1) != 0){
                ans = (ans * a)%x;

            }
            a = (a*a)%x;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(powMod(5, 4, 4));
    }
}