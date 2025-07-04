package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านความยาวน้อยกว่า 8 ตัวอักษร ควรจะ INVALID
        String pw = "123th";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected INVALID but got " + result1);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---
        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวพิมพ์เล็ก , ความยาวมากกว่า 8 ตัว ควรจะ WEAK
        pw = "sorayutth" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: Length 8 characters password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED: Expected WEAK but got " + result2);
        }

         // Test Case 3: รหัสผ่านทั้งหมดเป็นตัวเลขทั้งหมด , ความยาวมากกว่า 8 ตัว ควรจะ WEAK
        pw = "123456789" ;
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+pw+" : Passed: Length 8 number password is WEAK.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected WEAK but got " + result3);
        }

        // Test Case 4: รหัสผ่านมีตัวพิมพ์พิมพ์ใหญ่ , ตัวพิมพ์เล็ก , ความยาวมากกว่า 8 ตัวอักษร ควรจะ MEDIUM
        pw = "SorayutTH" ;
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 : "+pw+" : Passed: Have Uppercase letters password is MEDIUM.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected MEDIUM but got " + result4);
        }

        // Test Case 5: รหัสผ่านมีตัวพิมพ์เล็ก , ตัวเลข , ความยาวมากกว่า 8 ตัวอักษร ควรจะ MEDIUM
        pw = "sorayut123" ;
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 : "+pw+" : Passed: Have number password is MEDIUM.");
        } else {
            System.out.println("Test Case 5 : "+pw+" : FAILED: Expected MEDIUM but got " + result5);
        }

        // Test Case 6: รหัสผ่านมีตัวพิมพ์ใหญ่ , ตัวเลข , ความยาวมากกว่า 8 ตัวอักษร ควรจะ MEDIUM
        pw = "SORAYUT123" ;
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 : "+pw+" : Passed: Have number password is MEDIUM.");
        } else {
            System.out.println("Test Case 6 : "+pw+" : FAILED: Expected MEDIUM but got " + result6);
        }

        // Test Case 7: รหัสผ่านมีตัวพิมใหญ่มากกว่า 1 ตัว , ตัวเลขมากกว่า 1 ตัว , ความยาวไม่น้อยกว่า 8 ตัวอักษร ควรจะ STRONG
        pw = "Sorayut123TH" ;
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.STRONG) {
            System.out.println("Test Case 7 : "+pw+" : Passed: Have uppercase , lowercase , number password is STRONG.");
        } else {
            System.out.println("Test Case 7 : "+pw+" : FAILED: Expected STRONG but got " + result7);
        }

        System.out.println("--------------------------------");
    }
}
