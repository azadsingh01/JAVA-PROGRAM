public class Abstract{
    public static void main(String [] args){
   Mustang m = new Mustang();
   // Animal -> Horse -> Mustang

   Horse h = new Horse();
    h.walk();
    h.eat();

    Chicken c = new Chicken();
    c.walk();
    c.eat();
    }
}

abstract class Animal{

     Animal(){
        System.out.println("constructor of Animal");
    }


    void eat(){
        System.out.println("eats anythig");
    }


    abstract void walk();
}


class Horse extends Animal{

     Horse(){
        System.out.println("constructor of Horse");
    }

    void walk(){
        System.out.println("walk on 4 legs");
    }

}

class Mustang extends Horse{
     Mustang(){
        System.out.println("Mustang constructor call");
     }

}

class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}