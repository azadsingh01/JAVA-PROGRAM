public class MultiInherit{
    public static void main(String[] args){
    Dog dobby = new Dog();
    dobby.eat();
    dobby.color = "blue";
    System.out.println(dobby.color);
    dobby.bread = "big";
    System.out.println(dobby.bread);
    dobby.legs = 4;
    System.out.println(dobby.legs);
    }
}


//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammel extends Animal{
    int legs;
}

class Dog extends Mammel{
    String bread;
}