import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String email){
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }



    public static class EmailExampleTest {
        public static void main(String[] args) {
            EmailExample emailExample = new EmailExample();

            // Danh sách email hợp lệ
            String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
            // Danh sách email không hợp lệ
            String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

            // Kiểm tra email hợp lệ
            for (String email : validEmail) {
                boolean isValid = emailExample.validate(email);
                System.out.println("Email \"" + email + "\" is valid: " + isValid);
            }

            // Kiểm tra email không hợp lệ
            for (String email : invalidEmail) {
                boolean isValid = emailExample.validate(email);
                System.out.println("Email \"" + email + "\" is valid: " + isValid);
            }
        }
    }
}
