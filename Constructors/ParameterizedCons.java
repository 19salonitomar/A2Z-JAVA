package Constructors;

class Parameterized {
   // data members of the class
    String name;
    int id;
  
    Parameterized(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class ParameterizedCons 
{
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor
        Parameterized geek1 = new Parameterized("Sweta", 68);
        System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);
    }
}