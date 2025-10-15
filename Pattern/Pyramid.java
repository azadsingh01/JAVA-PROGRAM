public class Pyramid{

public static void pyrid(int n){
for(int i=1; i<=n; i++){
    for (int j=1; j<=i-1; j++){
        System.out.print(" ");
    }
    for(int j=1; j<=n-i+1; j++){
        System.out.print("*");
    }
    System.out.println();
}
}


// same Q. but diff mrthod 

public static void P(int n ){
    for(int i=1; i<=n; i++){
        int num_space = i-1;
        int num_star = n - num_space;

        for(int j=1; j<=num_space; j++){
            System.out.print(" ");
        }
        for(int k=1; k<= num_star; k++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//opposite loop same pyramid
public static void Op(int n ){
    for(int i=n; i>=1; i--){
        int num_space = n-i;
        int num_star = i;

        for(int j=1; j<=num_space; j++){
            System.out.print(" ");
        }
        for(int k=1; k<= num_star; k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


public static void main(String[] args){
  pyrid(4);
  P(4);
  Op(4);
}
}

    

    
















