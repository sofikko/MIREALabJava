package lab_30;

import java.util.regex.Pattern;

public class IPcheck {
    static String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    static boolean checkIP(String str){
        return Pattern.matches(pattern, str);
    }
}