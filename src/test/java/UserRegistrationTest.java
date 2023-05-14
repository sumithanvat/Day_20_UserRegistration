import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }
    String emailId;
    public UserRegistrationTest(String emailId){
        super();
        this.emailId = emailId;
    }

    @Test
    public void firstNameHappyTest() {
        boolean firstName = userRegistration.checkFirstName("Sumit");
        Assert.assertEquals(true, firstName);
    }

    @Test
    public void firstNameSadTest() {
        boolean firstName = userRegistration.checkFirstName("sumit");
        Assert.assertFalse(firstName);
    }

    @Test
    public void LastNameHappyTest() {
        boolean lastName = userRegistration.checkLastName("Hanvat");
        Assert.assertTrue(lastName);
    }

    @Test
    public void LastNameSadTest() {
        boolean lastName = userRegistration.checkLastName("hanvat");
        Assert.assertFalse(lastName);
    }

    @Test
    public void phoneNumberHappyTest() {
        boolean phoneNumber = userRegistration.checkMobileNumber("917581800900");
        Assert.assertTrue(phoneNumber);
    }

    @Test
    public void phoneNumberSadTest() {
        boolean phoneNumber = userRegistration.checkMobileNumber("111447581800900");
        Assert.assertFalse(phoneNumber);
    }

    @Test
    public void passwordHappyTest() {
        boolean password = userRegistration.checkPassword("Skhanvat@1");
        Assert.assertTrue(password);
    }

    @Test
    public void passwordSadTest() {
        boolean password = userRegistration.checkPassword("sumit");
        Assert.assertFalse(password);
    }

    @Test
    public void emailHappyTest() {
        boolean email = userRegistration.checkEmail("skhanvat11@gmail.com");
        Assert.assertTrue(email);
    }

     @Parameterized.Parameters
     public static Collection input(){
    return Arrays.asList( new String[] {"abc@yahoo.com","abc.100@abc.com.au","abc@1.com","abc+100@gmail.com","abc.100@yahoo.com","abc-100@abc.net","abc-100@yahoo.com","abc111@abc.com"});
}
    @Test
    public void checkEmailWithMultipleInputs(){
        Assert.assertEquals(true,userRegistration.checkEmail(emailId));
    }
}