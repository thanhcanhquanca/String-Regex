import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {

    // Biểu thức chính quy kiểm tra tên lớp học
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    private static Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);

    // Phương thức kiểm tra tính hợp lệ của tên lớp
    public boolean validate(String className) {
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }


    public static void main(String[] args) {
        ClassNameValidator validator = new ClassNameValidator();


        String[] validClassNames = {"C0223G", "A0323K", "P1234H"};

        String[] invalidClassNames = {"M0318G", "P0323A", "C12345", "A032@"};


        System.out.println("Valid class names:");
        for (String className : validClassNames) {
            System.out.println(className + " is valid: " + validator.validate(className));
        }


        System.out.println("\nInvalid class names:");
        for (String className : invalidClassNames) {
            System.out.println(className + " is valid: " + validator.validate(className));
        }
    }
}
