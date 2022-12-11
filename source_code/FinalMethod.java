// FinalMethod.java
// final methods
// cannot be overriden
// -> error

package xeimadio;

class Ox{
    final void sound() {
    System.out.println("MOUOUOU MOU MOUOU");
    }
} // end of class Ox

class smallOx extends Ox{
    void sound() { // error!
    System.out.println("mououou mou mouou"); // error!
    } // error!
}

class FinalMethod{
    
    public static void main(String[] args) { 
        smallOx obj = new smallOx();
        obj.sound();
   }
} // end of class FinalMethod
