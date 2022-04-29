package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {

    //REGEX
    public static void main(String[] args)
    {
        // String to be scanned to find the pattern.
        String line = "1879 ";
        String pattern;
        pattern = "^.?(\\d{4})[^?][\\w\\W]*$";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
        }else {
            System.out.println("NO MATCH");
        }
    }
}

