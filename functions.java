import java.util.*;
public class functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int printSum(int num1, int num2) {
        return num1+num2;        
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        printMyName(name);

        int num1 = read.nextInt();
        int num2 = read.nextInt();
        System.out.println(printSum(num1, num2));
        read.close();
    }
}