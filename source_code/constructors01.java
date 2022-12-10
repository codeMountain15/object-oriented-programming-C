// constructors01.java
//

package stani;

class Sheep{
  int age;
  String name;
  
  Sheep(int age, String name){ 
      this.age = age;
      this.name = name;
  }
} // end of class Sheep

class constructors01{
    // method
    public static void main(String[] args){

        Sheep obj = new Sheep(3,"Kitsos");
        System.out.println(obj.name + " is " + obj.age + " years old");
  
    } // end of main()
} // end of class constructors01
