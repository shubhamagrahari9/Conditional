import java.util.*;


public class largest {
    public static void main(String[] args){
        System.out.println("Enter two different numbers:-");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        if(x>y){
            System.out.println(x + " is greater than " + y);
        }
        else{
            System.out.println(y + " is greater than " + x);
        }
    }
}


