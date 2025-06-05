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
/*   
     Calculator cal = new Calculator();
     System.out.println(cal.sum(9,3));
     System.out.println(cal.sum(2.4f,3.6f));
     System.out.println(cal.sum(5,3,4));    
     */
    //runtime polymorphism- method overriding
     Fish f = new Fish();
     f.eat();
     Animal a = new Animal();
     a.eat();
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
   void eat(){
      System.out.println("Fish eat fishfood.");
   }
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

//method overloading - compiletime polymorphism
class Calculator{
   int sum(int a, int b){
      return a + b;
   }
   float sum(float a, float b){
      return a + b;
   }
   int sum(int a, int b, int c){
      return a + b + c;
   }
}
//method overriding = Animal & Fish class --> eat() 
//same fuction in both parent and child class