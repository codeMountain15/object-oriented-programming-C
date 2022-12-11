// Inheritance02.java
// keyword: super

package xeimadio;

class Animal{
    String type;
    int age;
}

class Ox extends Animal{
    String name;

    // constructors
    // Animal (String input1 "ox", int input2){ // error!
    Ox(){
        type = "ox";
        age = 1;
        name = "anonymous ox";
    }
    
    Ox(String input1, int input2, String input3){
        type = input1;
        age = input2;
        name = input3;
    }
    
    // get method
    void reveal(){
        System.out.println(name + " is an " + type + " aged " + age);
    }
}


class Inheritance02 extends Ox{
    
    Inheritance02(String input1, int input2, String input3){ 
        super(input1, input2, input3);
    };
    
    public static void main(String[] args) { 
        Inheritance02 obj01 = new Inheritance02("ox", 3, "Jojo");
        obj01.reveal();
   }
} // end of class Inheritance02
