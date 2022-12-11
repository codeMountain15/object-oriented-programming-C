// Mpee01.java
//

package anotherStani;
import stani.*;

class Sheep extends Mpee02{
    
    protected String name;
        
} // end of class Sheep


class Mpee01 extends Sheep{
    
    // method
    public static void main(String[] args){
        System.out.println("This is class Mpee01");
        System.out.println();
        
        // a parent object
        Sheep obj = new Sheep();
        if (obj.set_age(5)) { System.out.println(obj.get_age()); }; // ok
        
    } // end of main()
} // end of class Mpee01
