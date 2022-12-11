// Interface02.java
// see MultipleInheritance01.java

package xeimadio;

interface Animal01{
    String category = "Living entity";
    void show_category();
} // end of interface Animal01

interface Animal02{
    int age = 1;
    void show_age();
} // end of interface Animal02

class Ox implements Animal01, Animal02 {
    public void show_category(){ System.out.println(category); }
    public void show_age(){ System.out.println(age); }
    
    Ox(){
        System.out.println("This is the Ox constructor");
        show_category();
        show_age();
    }
}


class Interface02{
    
    public static void main(String[] args) { 
        Ox obj01 = new Ox();
           
   }
} // end of class Interface02
