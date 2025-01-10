import java.util.*;
public class Even{
    public static void main(String args[]){
        System.out.println("Enter a Number:-");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println(x+ " is Even number.");
        } 
        else{
            System.out.println(x + " is Odd number.");
        }
    }
}