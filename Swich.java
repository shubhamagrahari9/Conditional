import java.util.*;
public class Swich {
    public static void main(String args[]){
        System.out.println("Enter a number between 1 to 5 to make a wish:-");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        
        switch(z){
            case 1: System.out.println("Your Samosa is on the way.");
            break;

            case 2: System.out.println("Your Burger is on the way.");
            break;
            case 3: System.out.println("Your Jalebi is on the way.");
            break;
            case 4: System.out.println("Your Gulab Jamun is on the way.");
            break;
            case 5: System.out.println("Your Noodles is on the way.");
            break;
        }
    }
    
}
