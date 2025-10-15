public class PlnPyramid{
    public static void Plndrom(int n){
  for(int i=1; i<=n; i++){
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    for(int k=1; k<=i; k++){
        System.out.print(k);
    }

  
    for(int j=i-1; j>=1; j--){
        System.out.print(j);
    }

    System.out.println();
    }
    }

    public static void main(String[] args){
        Plndrom(5);
    }
}