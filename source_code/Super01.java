// Super01.java
// overriden method

package xeimadio;

class Animal{
    void speak() {
        System.out.println("This is the Animal speaking!");
    };
}

class Ox extends Animal{
    // method override
    void speak() {
        System.out.println("This is the Ox speaking!");
    };
    
    // method using super()
    void superSpeak(){
        super.speak();
    }
}


class Super01 extends Ox{
    
    public static void main(String[] args) { 
        Super01 obj01 = new Super01();
        obj01.speak();
        obj01.superSpeak();

        
   }
} // end of class Super01
