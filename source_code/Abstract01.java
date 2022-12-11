// Abstract01.java
// abstract classes
// abstract methods

package xeimadio;

abstract class Animal{
   // attribues
   protected int weight = 1;
    
   // methods 
   abstract void sound();
   void eat(){ weight++; }
} // end of class Animal

class Parrot extends Animal{
    // abstract method's body
    void sound(){
        System.out.println("$%$#*& &4 #$#@&*#");
    };
    
    // method override
    void eat(){ weight += 2; }
}


class Abstract01{
    
    public static void main(String[] args) { 
       Parrot obj = new Parrot();
       obj.sound();
       obj.eat();
       System.out.println(obj.weight);    
   }
} // end of class Abstract01
