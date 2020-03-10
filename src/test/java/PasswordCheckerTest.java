import com.sun.tools.javac.util.Assert;
//import org.junit.Assert;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

    PasswordChecker pc = new PasswordChecker();

    String password = "Nonk@098765";

    @Test

    public void Valid(){

        Assert.check(true, pc.PasswordIsValid(password));
    }

    @Test
public void passwordIsOkay(){

        Assert.check(true, pc.passwordIsOk());
}

}
