public class OOPs4 {
    public static void main(String[] args) {
       /*  Horse h = new Horse();
        h.walk();
       // h.eat();
        System.out.println(h.color);  */

        //Mustang g = new Mustang();
        Animal a = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
        System.out.println("Animal constructor called.....");
    }
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called.....");
    }
    void changeColor() {
         color =  "White";
    }
    void walk() {
        System.out.println("Horse Walks on 4 legs.");
    }
}
class Mustang extends Horse {
    Mustang() {
      System.out.println("Mustang constructor is called.....");
       
    }
}
class Chicken extends Animal {
    void changeColor() {
       color = "yellow";
    }
    void walk() {
        System.out.println("Chicken Walks on 2 legs.");
    }
}