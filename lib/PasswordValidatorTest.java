package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.\n");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1+"\n");
        }

        // Test Case 2: รหัสผ่านระดับ WEAK
        PasswordStrength result2 = PasswordValidator.validate("thanapon");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Short password is WEAK.\n");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2+"\n");
        }

        // Test Case 3: รหัสผ่านระดับ MEDIUM
        PasswordStrength result3_1 = PasswordValidator.validate("thanapon");
        if (result3_1 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3_1 Passed: Short password is MEDIUM.\n");
        } else {
            System.out.println("Test Case 3_1 FAILED: Expected INVALID but got " + result3_1+"\n");
        }PasswordStrength result3_2 = PasswordValidator.validate("Thanapon59854");
        if (result3_2 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3_2 Passed: Short password is MEDIUM.\n");
        } else {
            System.out.println("Test Case 3_2 FAILED: Expected INVALID but got " + result3_2+"\n");
        }PasswordStrength result3_3 = PasswordValidator.validate("ThanaponMondee");
        if (result3_3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3_3 Passed: Short password is MEDIUM.\n");
        } else {
            System.out.println("Test Case 3_3 FAILED: Expected INVALID but got " + result3_3+"\n");
        }

        // Test Case 4: รหัสผ่านระดับ STRONG
        PasswordStrength result4 = PasswordValidator.validate("F@tttt701844");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Short password is STRONG.\n");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4+"\n");
        }
        
        System.out.println("--------------------------------");
    }
}
