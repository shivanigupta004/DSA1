public class OOps3 {
    public static void main(String[] args) {
     // Fish shark = new Fish();
     // shark.eat();
/* 
     Dog dobby = new Dog();
     dobby.eat();
     dobby.legs = 4;
     System.out.println(dobby.legs);
     */

     
    }
}

  //Inheritance
 //base class
class Animal {
   String color;
   void eat(){
    System.out.println("Animal eats.");
   }
   void breathe(){
    System.out.println("Animal breathes.");
   }

}
//Derived class - single level inheritance
class Fish extends Animal{
   int fins;
   void swim(){
    System.out.println("Fish Swims in water.");
   }
}
// multilevel inheritance
class Mammals extends Animal {
   int legs;
   void walk() {
      System.out.println("Animal walks.");
   }
}

class Dog extends Mammals {
   String breed;
}
 //hierarchical-bird, mammal, fish all three extends Animal

class bird extends Animal {
   void fly(){
      System.out.println("Bird flys.");
   }
}
// all together(above) = hybrid inheritane