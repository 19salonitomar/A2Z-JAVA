package ControlStatements;

public class Switch {

    public static void main(String[] args) {
       

    String day = " Wednesday";   // New Version of switch case which work on string as well , 
                                //we don't need to write break and put : colon instead of that we can use arrow (->)..

    switch(day){

        case "Sunday" , "Saturday" -> System.out.println("Alaram at 8 Am");

        case "Monday", "Tuesday" -> System.out.println("Alaram at 6 Am");

        default -> System.out.println("Alaram at 7 Am" );

    }

int choice = 5;

switch(choice){
    case 1:
        System.out.println("Money Monday");
        break;
    case 2:
        System.out.println("Tinny Tuesday");
        break;
    case 3:
        System.out.println("Wild Wednesday");
        break;
    case 4:
        System.out.println("Think Thursday");
        break;
    case 5:
        System.out.println("Fry Friday");
        break;
    case 6:
    System.out.println("Sunny Saturday");
        break;
    case 7:
    System.out.println("Shine Sunday");
        break;    
     
    }

    }

}
