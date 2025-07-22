package OOPS_Concept;

public class Encapsulation {

//  Private data members
    private String name;
    private int age;
    private long balance;
    

// Getter And Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//Getter And Setter for balance 
    public long getbalance() {
        return balance;
    }
    public void setbalance(long balance) {
        this.balance = balance;
    }

//Getter And Setter for age
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }

    public static void main(String args[]) {
        Encapsulation obj = new Encapsulation();

        //Set Values:
        obj.setName("Siya");
        obj.setage(24);
        obj.setbalance(100000);

        System.out.println("CX Name is:" + obj.getName());
        System.out.println("CX age is :" + obj.getage());
        System.out.println("Cx Account Balance is RS:" + obj.getbalance());
    }
}