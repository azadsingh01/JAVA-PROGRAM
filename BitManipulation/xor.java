public class xur{
    public static int roxN(int n){
        int bitMask = n^n;
        return bitMask;
    } 
    public static void main(String args[]){
        System.out.println(roxN(4));
    }
}