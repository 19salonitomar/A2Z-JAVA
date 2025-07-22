package OOPS_Concept;

public class Oops {
    public static void main(String args[]) {
        Laptops lp1 = new Laptops();     //  Declare object normally

        lp1.brand = "HP";
        lp1.color = "Silver";
        lp1.generation = "11th";
        lp1.processor = "150986U";
        lp1.screensize = 15.4f; 
        lp1.RamRom = 256;
        lp1.price = 70000;

        lp1.trunOn();
    }
}

class Laptops {
    String brand;
    String color;
    String generation;
    String processor;
    float screensize;
    int RamRom;
    int price;

    void trunOn() {
        System.out.println(brand + " Laptop is Booting up....");
    }
}
