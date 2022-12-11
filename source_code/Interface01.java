// Interface01.java
// interfaces

package xeimadio;

interface Animal{
   // methods 
   void sound();
   void sleep();
} // end of interface Animal

class Parrot implements Animal{
    // methods
    public void sound(){
        System.out.println("$%$#*& &4 #$#@&*#");
    };
    
    public void sleep(){
        System.out.println("ZZZ$%$zz#*& &4zz #$zz#@ZZ&*#ZZZZ");
    };
} // end of class Parrot

class Chicken implements Animal{
    // methods
    public void sound(){
        System.out.println("Ko ko ko kooooo");
    };
    
     public void sleep(){
        System.out.println("ZZzZzzZZzZzZzZ");
    };
} // end of class Chicken

class Interface01{
    
    public static void main(String[] args) { 
       Parrot obj1 = new Parrot();
       obj1.sound();
       obj1.sleep();
       
       Chicken obj2 = new Chicken();
       obj2.sound();
       obj2.sleep();
       
   }
} // end of class Interface01
