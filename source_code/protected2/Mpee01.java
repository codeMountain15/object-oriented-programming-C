// Mpee01.java
//

package anotherStani;
import stani.Mpee02;

class Mpee01 extends Mpee02 {
    
    // constructor
    Mpee01(){
        System.out.println("This is Mpee01 (child class) constructor"); 
    }
    
    // method main()
    public static void main(String[] args){  
        
        // a parent object
        Mpee02 obj_a = new Mpee02();
        // obj_a.method01(); // error, method1() is protected in another package
        obj_a.method02(); // ok, method2() is public
        System.out.println();
        
        
        // a child object
        Mpee01 obj_b = new Mpee01();
        obj_b.method01(); // ok, protected method1() is inherited in Mpee01
        System.out.println();
        
    } // end of main()
} // end of class Mpee01
