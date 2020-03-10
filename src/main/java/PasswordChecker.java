import java.util.ArrayList;
import java.util.Scanner;

public class PasswordChecker {

    private static ArrayList<Integer> numErrors = new ArrayList<>();

    boolean exist = true;
    boolean PasswordLength = true;
    boolean UpperCase = true;
    boolean LowerCase = true;
    boolean Digit = true;
    boolean SpecialChar = true;
    boolean flag = false;

    public  boolean PasswordIsValid(String Password) {


        if (Password.isEmpty()) {
            exist = false;
            System.out.println("Password should not be empty");

            numErrors.add(1);
        }
        if (Password.length() < 8) {
            PasswordLength = false;
            System.out.println("Password should at least be 8 characters long");

            numErrors.add(1);
        }
        if (!Password.matches (".*([a-z]).*")) {
            LowerCase= false;
            System.out.println("Password should at least contain one lower case");

            numErrors.add(1);
        }
        if (!Password.matches (".*([A-Z]).*")) {
            UpperCase = false;
            System.out.println("Password should at least  contain one UpperCase");

            numErrors.add(1);
        }
        if (!Password.matches (".*[0-9].*")) {
            Digit = false;
            System.out.println("Password should at least contain one Digit");
            numErrors.add(1);

        }
        if (!Password.matches ("(.*[-!+ # % ^ * ( ) _ @ $].*)")) {
            SpecialChar = false;
            System.out.println("Password should at least contain one Special Character");

            numErrors.add(1);
        }

        if(SpecialChar ==true && Digit==true &&LowerCase == true&& UpperCase ==true &&PasswordLength ==true && exist==true)
        {
            flag = true;
        }



        return  flag;
    }


    public static boolean passwordIsOk() {

        Boolean trueOrFalse = false;

        if(numErrors.size()<= 3)
        {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "\n password should exist"
                + "\n password should be longer than than 8 characters"
                + "\n password should have at least one lowercase letter"
                + "\n password should have at least one uppercase letter"
                + "\n password should at least have one digit "
                + "\n password should have at least one special character");

        System.out.println("\n Please Enter Password: ");

        String s = input.nextLine();
        PasswordChecker pc = new PasswordChecker();
        try {
            if(pc.PasswordIsValid(s)){
                System.out.println("Password successful!");
            }

            if(passwordIsOk()){
                System.out.println("Password is OK!");
            }else{
                System.out.println("Password is not OK!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




