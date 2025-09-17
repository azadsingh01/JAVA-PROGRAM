import java.util.Arrays;
public class strAnagramsCheck{

    public static void main(String[] arg){
        String str = "jay shri ram";
        String str1 = "jay shri ram";


        str = str.toLowerCase();
        str1 = str1.toLowerCase();


        if (str.length() == str1.length()){

            char[] strArray = str.toCharArray();
            char[] str1Array = str1.toCharArray();

            Arrays.sort(strArray);
            Arrays.sort(str1Array);


            boolean result = Arrays.equals(strArray, str1Array);

            if (result){
                System.out.println(str + " and " + str1 + " are anagrams");
            }else{
                System.out.println(str + " and " + str1 + " are not anagrams");
            }





        
        }
    }
}