// Overriding01.java
//

package Xmas;

   
class EnglishWishes {
  public void wish() {
    System.out.println("Happy New Year!!");
  }
}

class GermanWishes extends EnglishWishes {
  public void wish() {
    System.out.println("Frohes Neues Jahr!!");
  }
}

class ItalianWishes extends EnglishWishes {
  public void wish() {
    System.out.println("Buon Anno!!");
  }
}


public class Overloading01 {

    public static void main(String[] args) {
        EnglishWishes wish01 = new EnglishWishes();
        GermanWishes wish02 = new GermanWishes();
        ItalianWishes wish03 = new  ItalianWishes();
        
        wish01.wish();
        wish02.wish();
        wish03.wish();
}
