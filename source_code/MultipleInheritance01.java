// MultipleInheritance01.java
// error

package xeimadio;

class Animal01{
    protected String category = "Living entity";
    Animal01(){ System.out.println("This is the Animal01 constructor"); }
} // end of class Animal01

class Animal02{
    protected int age = 1;
    Animal02(){ System.out.println("This is the Animal02 constructor"); }
} // end of class Animal02

class Ox extends Animal01, Animal02 { // error!
    Ox(){
        System.out.println("This is the Ox constructor");
    }
}


class MultipleInheritance01{
    
    public static void main(String[] args) { 
        Ox obj01 = new Ox();
           
   }
} // end of class MultipleInheritance01
