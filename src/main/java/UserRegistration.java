import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* Created class UserRegistration to write cases
 */
public class UserRegistration {
    // regex for first name
    static Pattern firstName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    // regex for lastName
    static Pattern lastName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    // regex for eMail
    static Pattern emailPattern = Pattern.compile("^[a-z0-9]{3,}([+-._]{1}[0-9]+)?@[a-z0-9]+[.]{1}[a-z]{2,}[,]?([.]{1}[a-z]{1,})?$");
    // regex for mobileNumber
    static Pattern mobileNumber = Pattern.compile("^([0-9]{2,4})?[\s]?[0-9]{10}$");
    // regex for passwordRules
    static Pattern passwordRule = Pattern.compile("^(?=.*[A-Z])(?=.*[!@#$%&*()])(?=.*[0-9])(?=\\S+$).{8,}$");

/*
* Created method for checkFirstName
 */
    public boolean checkFirstName(String userFirstName) {
        Matcher matcher = firstName.matcher(userFirstName);
        if (matcher.matches()) {
            return true;
        } else {

            return false;
        }
    }

    /*
     * Created method for checkLastName
     */
    public boolean checkLastName(String userLastName) {
        Matcher matcher = lastName.matcher(userLastName);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Created method for checkMobileNumber
     */
    public boolean checkMobileNumber(String userMobileNumber) {
        Matcher matcher = mobileNumber.matcher(userMobileNumber);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Created method for checkPassword
     */
    public boolean checkPassword(String userPassword) {
        Matcher matcher = passwordRule.matcher(userPassword);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Created method for checkEmail
     */
    public boolean checkEmail(String userEmailId) {
        Matcher matcher = emailPattern.matcher(userEmailId);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}

