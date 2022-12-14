// Overloading01.java
//

package Xmas;

public class Overloading01 {
   
static int add(int x, int y) {
  return x + y;
}

static float add(float x, float y) {
  return x + y;
}

public static void main(String[] args) {
  int num01;
  float num02;
    
  num01 = add(1, 2);
  num02 = add(1.01f, 3.10f);
  
  System.out.println("Ths integer sum is: " + num01);
  System.out.println("The float sum is: " + num02);
}
    
}
