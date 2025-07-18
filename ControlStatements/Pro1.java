package ControlStatements;

public class Pro1 {

    public static void main(String[] args) {

        for(int i  = 0; i <= 5 ; i++){
            for(int j = 1; j <= 4; j++) {
                 System.out.print(i * j + " ");
            }
            System.out.println(); // to go to new line after each inner loop
        }
    }
    
}
