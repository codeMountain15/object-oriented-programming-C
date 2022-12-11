// Static02.java
// static methods

package Department;

class Calculate{
    
    // static method
    static int add(int a, int b){
        return a + b;
    }
} // end of class Calculate

class Static02{
    
    public static void main(String[] args) { 
        int show = Calculate.add(3, 4);
        
        System.out.println(show);
   }
} // end of class Static02
