
import org.junit.Assert;
import org.junit.Test;

public class User_Registration_Test {
 User_Registration userdetails = new User_Registration();

 @Test
 public void first() {
  String firstname = userdetails.First_Name("Amruta");
  Assert.assertEquals(firstname, "Happy");
 }

 @Test
 public void last() {
  String lastname = userdetails.Last_Name("Shinde");
  Assert.assertEquals(lastname, "Happy");
 }

 @Test
 public void email() {
  String email = userdetails.mail("Amrutash@123.com");
  Assert.assertEquals(email, "Happy");
 }

 @Test
 public void password() {
  String pass = userdetails.PassRule1("Amruta@123");
  Assert.assertEquals(pass, "Happy");
 }

 @Test
 public void phonenum()
 {
  String phone = userdetails.phoneno("911523465890");
  Assert.assertEquals(phone,"Happy");
 }
}