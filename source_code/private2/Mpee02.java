// Mpee02.java
// private member

package stani;

// protected class Mpee02{ // ---> error!
public class Mpee02{
    private int age;
    
    // methods
    public boolean set_age(int input) { 
        age = input;
        return true;
   }
    
   public int get_age() { 
        return age;
   } 
} // end of class Mpee02
