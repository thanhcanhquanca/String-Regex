import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public AccountExample(){

    }
    private boolean validte(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
    public class AccountExampleTest {

        private static AccountExample accountExample;

        public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
        public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

        public static void main(String args[]) {
            accountExample = new AccountExample();
            for (String account : validAccount) {
                boolean isValid = accountExample.validte(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }
            for (String account : invalidAccount) {
                boolean isValid = accountExample.validte(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }
        }
    }


}

