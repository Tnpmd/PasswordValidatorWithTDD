package lib;

public class PasswordValidator {

    /**
     * ทำระดับความยากง่ายของpassword
     * @param รับ password เป็นสตริง
     * @return ระดับความแข็งแรงของpassword
     */
    public static PasswordStrength validate(String password) { 
        int minLength = 8;
        int maxLength = 20;
        int count = 0;
        boolean Upper = false;
        boolean Lower = false;
        boolean Digit = false;
        boolean Specail = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                Lower = true;
            }else if (Character.isUpperCase(c)) {
                Upper = true;
            }else if (Character.isDigit(c)) {
                Digit = true;
            }else {
                Specail = true;
            }
        }
            if(Lower){count++;}
            if(Upper){count++;}
            if(Digit){count++;}
            if(Specail){count++;}

            if (password == null || password.length() < minLength || password.length() > maxLength || password.isEmpty()) {
            return PasswordStrength.INVALID;}
            if(count == 1 ) {return PasswordStrength.WEAK;
            }else if(count == 2 || count == 3){return PasswordStrength.MEDIUM;
            }else if(count == 4){return PasswordStrength.STRONG;
            }else return PasswordStrength.INVALID;
            
}
}