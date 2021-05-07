package Utils;

import java.util.regex.Pattern;

public class Utility {

    public static boolean isValidEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();

    }

}
