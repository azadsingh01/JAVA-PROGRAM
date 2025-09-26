public class UseStatic{
    public static void main(String args[]){
   
   Student s1 = new Student();
   s1.name = "azad";
   s1.schoolName = "JVM";
   System.out.println(s1.name);
   System.out.println(s1.schoolName);

   Student s2 = new Student();
   s2.name = "aman";
   System.out.println(s2.name);
   System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}