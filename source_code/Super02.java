// Super02.java
// same variable names

package xeimadio;

class Animal{
    protected String category = "Living entity";
    }

class Ox extends Animal{
    protected String category = "Cattle";
    
    // method using super
    void say(){
        System.out.println(category);
        System.out.println(super.category);
    }
}


class Super02 extends Ox{
    
    public static void main(String[] args) { 
        Super02 obj01 = new Super02();
        obj01.say();        
   }
} // end of class Super02
