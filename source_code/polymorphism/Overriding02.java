// Overriding02.java
// casting

package Xmas;
 
class XmasSweets {
  public void say() {
    System.out.println("I love Xmas sweets!!!");
  }
}

class Kourambiedes extends XmasSweets {
  public void say() {
    System.out.println("I love Kourambiedes!!!");
  }
}

class Melomakarona extends XmasSweets {
  public void say() {
    System.out.println("I love Melomakarona!!!");
  }
}

class Diples extends XmasSweets {
  public void say() {
    System.out.println("I love Diples!!!");
  }
}

class Roxakia extends XmasSweets {
  public void say() {
    System.out.println("I love Roxakia!!!");
  }
}


public class Overloading01 {

    public static void main(String[] args) {
        XmasSweets mam;
        
        mam = new Kourambiedes();
        mam.say();
        
        mam = new Melomakarona();
        mam.say();
        
        mam = new Diples();
        mam.say();
        
        mam = new Roxakia();
        mam.say();

    } // end of main()
} // end of public class Overloading01
