import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int button = reader.nextInt();
        switch(button) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Sunday");
        }
        reader.close();
    }
}
