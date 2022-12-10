// Mpee01.java
//

package stani;

class Mpee01{
    
    // method
    public static void main(String[] args){
        System.out.println("This is class Mpee01");
        System.out.println();
        
        // a parent object
        Mpee02 obj_a = new Mpee02();
        obj_a.method01(); // ----> error!!
        System.out.println();
    } // end of main()
} // end of class Mpee01
