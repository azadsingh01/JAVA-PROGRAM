
public class swaptwoNo{
    public static void main(String args[]){
        int a = 3 , b = 4;
        System.out.println("Before swap a= "+ a + " and b= "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap a= "+a+" and b= "+b);
    }
}