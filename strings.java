import java.util.*;

public class strings {
    public static void main(String[] args) {
        // String name = "Tony";
        // String fullNamw = "Tony Stark";
        // String sentence = "My name is tony stark";
        // Scanner sc = new Scanner(System.in);
        // String myName = sc.nextLine();
        // System.out.println("Your name is " + myName);

        // functions

        // Concatenation
        // String firstName = "Tony";
        // String secondName = "Stark";
        // String fullName = firstName + " " + secondName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // for(int i=0; i<fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // Comparison
        // String name1 = "Tony";
        // String name2 = "Tony";

        // if(name1.equals(name2)) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // //DO NOT USE == to check for string equality
        // //Gives correct answer here
        // if(name1 == name2) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // //Gives incorrect answer here
        // if(new String("Tony") == new String("Tony")) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // substring
        String name = "TonyStark";
        System.out.println(name.substring(0, 4));

    }
}
