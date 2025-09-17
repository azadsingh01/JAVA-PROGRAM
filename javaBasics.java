import java.util.*;

public class javaBasics {
    
      public static int dectobin(int n){
        int Mynum = n;
        int bin = 0;
        int pow =0;
        while(n>0){
           int rem =  n%2 ;
           bin = bin +  (rem * (int)Math.pow(10,pow));
           pow++;
           n=n/2;
      
        }System.out.println("binary no is " + Mynum + "=" + bin);
        return 0;
    }
            
    
    

    public static void halfPyrmd(int n){
        int counter =1;
        for (int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;

            }
             
            
             
            System.out.println();
        }

    }



    public static int triangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        return 0;
    }


  public static int butterFly(int n){
    for (int i=1; i<=n; i++){

        for (int j=1; j<=i; j++){
            System.out.print("*");
        }

        for (int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>=1; i--){

        for (int j=1; j<=i; j++){
            System.out.print("*");
        }

        for (int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
      System.out.println();
   
    }
    return 0;
  }


  public static int rumBus(int n){
    for (int i=1; i<=n; i++ ){

        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    return 0;
  }

  public static void holoRumbus(int n){
    for (int i=1; i<=n; i++){

        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            if (i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        
        }
        System.out.println();
    }
  }


  public static void dimond(int n){

    for(int i=1; i<=n; i++){

        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n; i>=1; i--){
         for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();

    }
  }


     public static void main(String[] args) {
     dimond(4);
    }

}

    
    


