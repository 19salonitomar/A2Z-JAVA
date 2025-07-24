package Constructors;

public class CopyConstructor {
    String name ;
    int age;
    int rollno;

    //Parametrized Constructor
    CopyConstructor(String name, int age, int rollno) {
            this.name = name;
            this.age = age;
            this.rollno = rollno;
    }

     // Copy Constructor
    CopyConstructor(CopyConstructor cc) {
        this.name = cc.name;
        this.age = cc.age;
        this.rollno = cc.rollno;
    }

    /* toString() method to print object values
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Roll No: " + rollno;
    } */ 

public static void main(String args[]) {
    CopyConstructor CC1 = new CopyConstructor("Siya", 24, 143);
    CopyConstructor CC2 = new CopyConstructor(CC1);

   System.out.println("Original Object → " + CC1.name + "-"+ CC1.rollno);
   System.out.println("Copied Object   → " + CC2.age);
}
}