// Mpee02.java
// protected member

package stani;

// protected class Mpee02{ // ---> error!
public class Mpee02{
   
    // constructor
    // it has to be public in ortder to be accessed outside the package
    public Mpee02(){
        System.out.println("This is Mpee02 (parent class) constructor"); 
    }
    
    // methods
    protected void method01() { 
        System.out.println("...transmitting 'MPEEE MPEEEEE'"); 
   }
    
    public void method02() { 
        System.out.println("...transmitting 'MPEEE MPEEEEE' again"); 
   }
} // end of class Mpee02
