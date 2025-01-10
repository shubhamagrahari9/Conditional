import java.util.*;
public class Income {
    public static void main(String args[]){
        System.out.println("Enter your Income :-");
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        if(Income<500000){
            System.out.println("Zero Tax");
        }
        else if(Income>500000 && Income<1000000){
            System.out.println("Tax is :"+Income*20/100);
        }
        else{
            System.out.println(" Tax is "+ Income*30/100);
        }
    }
}
