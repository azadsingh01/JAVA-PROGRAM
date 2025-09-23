public class Overriding{
    public static void main(String[] args){
     // create Deer class obj. so print "eat grass"
    Deer d1 = new Deer();
    d1.eat();
    }
}

    class Animal{
        void eat(){
            System.out.println("eat anything");
        }
    }

    class Deer extends Animal{
        void eat(){
            System.out.println("eat grass");
        }
    }
