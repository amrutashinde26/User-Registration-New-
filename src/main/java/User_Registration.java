import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstname = sc.next();
        First_Name(firstname);
    }

    public static String First_Name(String first) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(first);
        boolean ismatch = matcher.matches();
        if (ismatch)
        {
            System.out.println("Valid Input");
        } else {
            System.out.println("Invalid Input");
        }
        return " ";

    }

}
