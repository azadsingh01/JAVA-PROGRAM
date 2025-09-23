public class HibridInheri{
    public static void main(String args[]){
    Sharks shark = new Sharks();
    shark.eats();
    Peacock P = new Peacock();
    P.fly();
    P.eats();
    Dog dobby = new Dog();
    dobby.run = 25;
    }
}

class Animal{
   void eats(){
        System.out.println("eats");
    }
    void breath(){
          System.out.println("Breath");
        }
    
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flying a bird");
    }
}

class Mammel extends Animal{
    int run;
    {
    System.out.println("run is "+run+"km/h");
}
}

class Sharks extends Fish{
    int size;
}

class Peacock extends Bird{
    String color;
}

class Dog extends Mammel{
    String legs;
}