// Mpee01.java
//

package stani;
//import stani.Mpee02;

class Mpee01 extends Mpee02 {
    
    // constructor
    Mpee01(){
        System.out.println("This is Mpee01 (child class) constructor"); 
    }
    
    void method02() { 
        System.out.println("...transmitting 'MPEEE MPEEEEE' from child (Mpee01)"); 
   }
    
    // method
    public static void main(String[] args){
        System.out.println("This is class Mpee01");
        System.out.println();
        
        // a parent object
        Mpee02 obj_a = new Mpee02();
        obj_a.method01();
        System.out.println();
        
        // a child object
        Mpee01 obj_b = new Mpee01();
        obj_b.method01();
        System.out.println();
        
        // and a more complicated example:
        // a child object referencing to parent
        Mpee02 obj_c = new Mpee01();
        obj_c.method01(); // !!!
        System.out.println();
        
        /* // -----> error!
        System.out.println("Calling a Mpee01 object method:");
        Mpee01 obj_d = new Mpee02();
        obj_d.method01();
        System.out.println();
        */
        
    } // end of main()
} // end of class Mpee01
