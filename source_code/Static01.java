// Static01.java
// static attributes

package Department;

class Student{
    // atributes
    static String departmentName;
    String name;
    
    // methods
    Student(String a, String b){
       name = a;
       departmentName = b;
    }
    
    void inform(){
       System.out.println("This is " + name + " speaking from " + departmentName + " department"); 
    }
} // end of class Student

class Static01{
    
    public static void main(String[] args) { 
        Student std01 = new Student("Mitsos", "Informatics");
        std01.inform();
        
        Student std02 = new Student("Mairy", "Medicine");
        std02.inform();
        
        // something looks wrong...
        std01.inform();
        // but this is the way static attributes behave!
   }
} // end of class Static01
