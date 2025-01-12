public class Ternary {
    public static void main(String args[]){
        int x = 10;
        String y = ((x%2==0)?"even":"odd");
        System.out.println(y);
    }
}
/*
 Variable = Condition?Statement1:Statement2;
 for example:
 String type = (10%2 ==0)?"Even":"Odd";
 */