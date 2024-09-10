import java.util.*;
public class variables {
    public static void main(String args[]) {
        // variables
        // String name = "Shivansh";
        // int age = 19;
        // double price = 25.25;
        // int a = 25;
        // int b = 10;  
        // b = 20;
        // name = "Harsh";
        // Java is a typed language
        // int a = 5;
        // int b = 10;
        // int sum = a + b;
        // System.out.println(sum);
        // int diff = b - a;
        // System.out.println(diff);
        // int multiply = a * b;
        // System.out.println(multiply);

        //Input
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // it takes only a single word
        String name = sc.nextLine(); // it takes the whole line
        // nextInt(), nextFloat(), nextDouble(), nextLong();
        System.out.println(name);
        sc.close();
    }
}