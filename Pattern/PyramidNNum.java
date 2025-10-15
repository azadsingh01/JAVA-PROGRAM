public class PyramidNNum{
public static void pyr(int n){
  int num = 1;

    for(int i=1; i<=n; i++){
        for (int j=1; j<=n-i; j++){
            System.out.print("\t");
    
        }
        for(int k=1; k<=i; k++){
            System.out.print(num + "\t\t");
            num++;
        }

        System.out.println();
    }

}

public static void main(String [] args){
    pyr(5);
}
}