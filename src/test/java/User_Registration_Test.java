
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class User_Registration_Test {
 User_Registration userdetails = new User_Registration();

 @Test
 public void first() {
  try {
   String firstname = User_Registration.First_Name("Amruta");
   Assert.assertEquals(firstname, "Happy");
  } catch (User_Registration_Exception e) {
   System.out.println("Exception Occurs" + e);
  }
 }

 @Test
 public void last() {
  try {
   String lastname = User_Registration.Last_Name("Shinde");
   Assert.assertEquals(lastname, "Happy");
  } catch (User_Registration_Exception e) {
   System.out.println("Exception Occurs" + e);
  }
 }

 @Test
 public void email() {
  try {
   String email = User_Registration.mail("Amrutash@123.com");
   Assert.assertEquals(email, "Happy");
  } catch (User_Registration_Exception e) {
   System.out.println("Exception Occurs" + e);
  }
 }

 @Test
 public void password() {
   try {

    String pass = User_Registration.PassRule1("Amruta@123");
    Assert.assertEquals(pass, "Happy");
   } catch (User_Registration_Exception e) {
    System.out.println("Exception Occurs" + e);
   }
  }

 @Test
 public void phonenum() {
     try {
      String phone = User_Registration.phoneno("911523465890");
      Assert.assertEquals(phone, "Happy");
     } catch (User_Registration_Exception e) {
      System.out.println("Exception Occurs" + e);
     }
    }

 @ParameterizedTest
 @ValueSource(strings = {
         "test@gmail.com",
         "testexample@gmail.com",
         "test-test12@gmail.com",
         "test11@gmail.com"
 })
 public void validemail(String mail) {
  try {
   String result = userdetails.mail(mail);
   Assert.assertEquals(result, "Happy");
  }
  catch(User_Registration_Exception e)
  {
   System.out.println("Exeption Ocuurs" + e);
  }
 }
}