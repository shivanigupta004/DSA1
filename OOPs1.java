public class OOPs1 {
    public static void main(String[] args) {
       Pen p1 = new Pen(); //constructor-p1 is a pen object
       p1.setColor("blue");
       System.out.println(p1.getColor());
       p1.setTip(5);
       System.out.println(p1.getTip());
       p1.setColor("yellow");
       System.out.println(p1.getColor());

       BankAccount myAcc = new BankAccount();
       myAcc.username = "shivanigupta";
       myAcc.setPassword ("abcdefghi");
     }
}

class BankAccount{
  public  String username; 
  private String password;
  public void setPassword(String Npassword) {
    password  = Npassword  ;   
  }
}

class Pen{
  private String color;
  private int tip;
 //getters
  String getColor(){
    return this.color;
  }
  int getTip(){
    return this.tip;
  }
  //setters
  void setColor(String newColor){
    color = newColor;
  }
  void setTip(int Tip){
    this.tip = Tip;
  }
}
