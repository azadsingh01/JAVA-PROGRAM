public class Inheritence{
    public static void main(String[] args){
    Fish shark = new Fish();
    Bird pison = new Bird();
      shark.eat();
      pison.eat();
    }
}


//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
   void fly(){
    System.out.println("fly");
   }
}