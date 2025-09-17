import java.util.*;

public class arraysCC{
    public static void subarray(int number[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<number.length; i++){
            int start = i;
            for (int j=i; j<number.length; j++){
                int end = j;
                currentSum = 0;
                for(int k=start; k<=end; k++){
                    currentSum += number[k];
           System.out.print(currentSum);
           if(maxSum < currentSum){
               maxSum = currentSum;
           }
           
                    
         }
            
      }
    
            System.out.println( "max sum = " + maxSum);
    }
    System.out.println();
}




 public static void subArr(int number[]){
        int ms = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int cs = 0;

        for (int i=0; i<number.length; i++){
            cs = cs + number[i];

            if (cs < 0){
                cs = 0;
            }
             ms = Math.max(cs, ms);
            
        }
        for(int i=0; i<number.length; i++){
            cs = cs + number[i];
            if(cs < 0){
            mn = Math.min(cs, mn);   
            }
            System.out.print("smallest no =" + mn);

        }
        System.out.print ("our max sum is = " + ms);
    }


    
    public static int taprainWater(int height[]){
        int n = height.length;
       int leftMax[] = new int [n];
        leftMax[0] = height[0];
       for( int i=1; i<n; i++){
           leftMax[i] = Math.max(height[i], leftMax[i-1]);
       }
       
       int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
       for( int i=n-2; i>=0; i--){
           rightMax[i] = Math.max(height[i] , rightMax[i+1]);
       }
       int tappWater = 0;
       for( int i=1; i<n; i++){
           int waterLevel = Math.min(leftMax[i], rightMax[i]);
           tappWater += waterLevel - height[i];
       }
       return tappWater;
       
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
       System.out.print("total water tap = " + taprainWater(height));
    }
}


    







  