import java.util.*;
public class Greatest {
    public static void main(String args[]){
        System.out.println("Enter 3 different numbers:-");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>=y && x>=z){
            System.out.println(x + " is largest.");
        }
        else if(y>=z){
            System.out.println(y + " is largest.");
        }
        else{
            System.out.println(z + " is largest.");
        }
    }
}
