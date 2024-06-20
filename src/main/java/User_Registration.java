import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstname = sc.next();
            First_Name(firstname);
            System.out.println("Enter Last Name");
            String lastname = sc.next();
            Last_Name(lastname);
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter Email Id");
                String emailid = sc.next();
                mail(emailid);
            }
            System.out.println("Enter Phone Number");
            String phoneno = sc.next();
            phoneno(phoneno);
            System.out.println("Enter Password Which have 8 Character");
            String pass1 = sc.next();
            PassRule1(pass1);
        }
        catch (User_Registration_Exception e)
        {
            System.out.println("Exception Occurs" + e);
        }
    }

    public static String First_Name(String first) throws User_Registration_Exception
    {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(first);
        boolean ismatch = matcher.matches();
        if (ismatch)
         { 
            return "Happy";
        } else
        {
            throw new User_Registration_Exception("Enter Correct First Name");
        }

    }

    public static String Last_Name(String last) throws  User_Registration_Exception{
        Pattern pattern = Pattern.compile("[A-z][a-z]{3,}");
        Matcher matcher = pattern.matcher(last);
        boolean ismatch = matcher.matches();
        if (ismatch) {
            return "Happy";
        } else {
            throw new User_Registration_Exception("Enter Correct Last Name");
        }

    }

    public static String mail(String mail) throws User_Registration_Exception {
        Pattern pattern = Pattern.compile("^([a-zA-z0-9._%-]+@[a-zA-z0-9.-]+\\.[a-zA-Z]{3,})$");
        Matcher matcher = pattern.matcher(mail);
        boolean ismatch = matcher.matches();
        if (ismatch) {
            return "Happy";
        } else
        {
            throw new User_Registration_Exception("Enter Valid Mail Id");
        }
    }

    public static String phoneno(String number) throws User_Registration_Exception{
        Pattern pattern = Pattern.compile("^[0-9]{2}[0-9]{10}$");
        Matcher matcher = pattern.matcher(number);
        boolean ismatch = matcher.matches();
        if (ismatch)
        {
            return "Happy";
        } else
        {
            throw new User_Registration_Exception("Enter Valid Phone Number");
        }
    }

    public static String PassRule1(String pass1) throws User_Registration_Exception {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$");
        Matcher matcher = pattern.matcher(pass1);
        boolean ismatch = matcher.matches();
        if (ismatch)
        {
            return "Happy";
        } else
        {
            throw new User_Registration_Exception("Set Valid Passwword");
        }
    }
}