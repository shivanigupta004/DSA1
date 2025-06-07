public class OOPs5 {
    public static void main(String[] args) {
        /*Queen q = new Queen();
        q.moves();  */

        Bear b =new Bear();
        b.eats();
        b.eat();
    }
}
//Interfaces

interface chessPLayer {
    void moves();    
}

class Queen implements chessPLayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal ( in all dir)");
    }
}
class Rook implements chessPLayer {
    public void moves() {
        System.out.println("up, down, right, left");
    }
}
class King implements chessPLayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal ( by 1 step)");
    }
}


interface Herbivore {
   void eats();    
}
interface Carnivore {
  void eat();
}
class Bear implements Herbivore,Carnivore {
    public void  eats() {
        System.out.println("Bear eats plants.");
    }
    public void eat() {
       System.out.println("Bear eats meat ( Flesh of another animal.)");
    }
}