import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    // Biểu thức chính quy để kiểm tra số điện thoại
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    private static Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);

    // Phương thức kiểm tra tính hợp lệ của số điện thoại
    public boolean validate(String phoneNumber) {
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // Phương thức main để kiểm thử
    public static void main(String[] args) {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        // Danh sách số điện thoại hợp lệ
        String[] validPhoneNumbers = {"(84)-(0978489648)", "(33)-(0123456789)"};
        // Danh sách số điện thoại không hợp lệ
        String[] invalidPhoneNumbers = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)", "(8)-(0978489648)"};

        // Kiểm tra các số điện thoại hợp lệ
        System.out.println("Valid phone numbers:");
        for (String phoneNumber : validPhoneNumbers) {
            System.out.println(phoneNumber + " is valid: " + validator.validate(phoneNumber));
        }

        // Kiểm tra các số điện thoại không hợp lệ
        System.out.println("\nInvalid phone numbers:");
        for (String phoneNumber : invalidPhoneNumbers) {
            System.out.println(phoneNumber + " is valid: " + validator.validate(phoneNumber));
        }
    }
}
