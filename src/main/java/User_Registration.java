import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter First Name");
        String firstname = sc.next();
        First_Name(firstname);*/
       /* System.out.println("Enter Last Name");
        String lastname = sc.next();
        Last_Name(lastname); */
        System.out.println("Enter Email Id");
        String emailid = sc.next();
        mail(emailid);
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

    public static String Last_Name(String last)
    {
        Pattern pattern = Pattern.compile("[A-z][a-z]{3,}");
        Matcher matcher = pattern.matcher(last);
        boolean ismatch = matcher.matches();
        if(ismatch)
        {
            System.out.println("Valid Input");
        }
        else
        {
            System.out.println("Invalid Input");
        }
        return  " ";
    }

    public  static  String mail( String mail)
    {
        Pattern pattern = Pattern.compile("^([a-zA-z0-9._%-]+@[a-zA-z0-9.-]+\\.[a-zA-Z]{2,})$");
        Matcher matcher = pattern.matcher(mail);
        boolean ismatch = matcher.matches();
        if(ismatch)
        {
            System.out.println("Valid Email Id");
        }
        else {
            System.out.println("Invalid Email Id");
        }
        return " " ;
    }

    
}
