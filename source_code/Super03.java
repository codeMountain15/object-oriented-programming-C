// Super03.java
// same variable names

package xeimadio;

class Animal{
    Animal() {
    System.out.println("This is the Animal constructor");
    }
} // end of class Animal

class Ox extends Animal{
    Ox() {
    super(); // calling the superclass constructor
    System.out.println("This is the Ox constructor");
    }
}


class Super03 extends Ox{
    
    public static void main(String[] args) { 
        Super03 obj01 = new Super03();
           
   }
} // end of class Super03
