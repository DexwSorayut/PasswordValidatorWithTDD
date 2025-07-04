package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param รับค่าเป็น string เข้าระบบเพื่อตรวจสอบ ค่าที่รับเข้าจะต้องไม่เป็นอักษรพิเศษ
     * @return ส่งค่า PasswordStrength.INVALID กลับเมื่อค่าไม่ถูกต้อง
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        if(password == null || password.length() < 8){
            return PasswordStrength.INVALID;
        }

        int upper = 0;
        int lower = 0;
        int digit = 0;
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
                lower++;
            
            if(Character.isUpperCase(c))
                upper++;
            
            if(Character.isDigit(c))
                digit++;
        }
        if(lower == password.length() || digit == password.length())
             return PasswordStrength.WEAK;
        
        if(upper + lower == password.length() || lower + digit == password.length() || upper + digit == password.length())
            return PasswordStrength.MEDIUM;
        
        if((password.length()> 8)&&(upper > 1)&&(digit >= 1))
            return PasswordStrength.STRONG;
        
        return PasswordValidator.validate(password);
    }
}