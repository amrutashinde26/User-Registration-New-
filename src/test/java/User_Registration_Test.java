
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class User_Registration_Test {
 User_Registration userdetails = new User_Registration();

 @Test
 public void first() {
  String firstname = User_Registration.First_Name("Amruta");
  Assert.assertEquals(firstname, "Happy");
 }

 @Test
 public void last() {
  String lastname = User_Registration.Last_Name("Shinde");
  Assert.assertEquals(lastname, "Happy");
 }

 @Test
 public void email() {
  String email = User_Registration.mail("Amrutash@123.com");
  Assert.assertEquals(email, "Happy");
 } 

 @Test
 public void password() {
  String pass = User_Registration.PassRule1("Amruta@123");
  Assert.assertEquals(pass, "Happy");
 }

 @Test
 public void phonenum()
 {
  String phone = User_Registration.phoneno("911523465890");
  Assert.assertEquals(phone,"Happy");
 }


@ParameterizedTest
@ValueSource(strings = {
        "test@gmail.com",
        "testexample@gmail.com",
        "test-test12@gmail.com",
        "test11@gmail.com"
})
 public void validemail(String mail)
 {
  String result = userdetails.mail(mail);
  Assert.assertEquals(result,"Happy");
 }

}