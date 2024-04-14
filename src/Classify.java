import java.io.*;
import java.util.*;

public class Classify {

    public static String classify( char c ) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        String upper = "";
        String vowel = "";
        if (Character.isAlphabetic(c) == false) {
            return "empty";
        }
        char cL = Character.toLowerCase(c);
        for (char v : vowels) {
            if (v == cL) {
                vowel = "vowel";
                break;
            } else {
                vowel = "consonant";
            }
        }

        if (Character.isUpperCase(c)) {
            upper = "uppercase";
        } else {
            upper = "lowercase";
        }
        String ans = upper + " " + vowel;
        return ans;
    }
}
