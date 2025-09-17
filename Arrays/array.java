import java.util.*;

public class array{

    public static boolean noRepeat(int number[]){
  
  for(int i=0; i<number.length - 1; i++){
    for(int j=i+1; j<number.length; j++){
        if(number[i] == number[j]){
            System.out.println(j);
            return true;
        }else {
            return false;
        }
    }
    System.out.println(i);
  }
}



public static void main(String args[]){
    int number[]={1,3,4,6,9,1};
    noRepeat(number);
 }
    
}