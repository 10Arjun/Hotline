// Java implementation for converting
// a string into it's ASCII equivalent senten

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

class Hotline {

    static String ASCIIConvert(String str) {
        int l = str.length();
        int convertASCII = 0;
        char[] ch = str.toCharArray();
        String newStr = "";
        for (int i = 0; i < 7; i++) {
            convertASCII = str.charAt(i);
            String s = Integer.toString(convertASCII);
            newStr += ch[i];
        }
        return newStr;
    }


    // Driver function
    public static void main(String[] args) {
        boolean Running = true;
        while (Running == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input the hotline you would like to contact");
            String Conversion = sc.nextLine();
            //PARSE NUMBERS
            char[] Temporary = Conversion.toCharArray();
            Conversion = Conversion.toUpperCase();

            String siu = "";

            for (int g = 0; g < Temporary.length; g++) {
                if (Temporary[g] != ' ') {
                    siu = siu + Temporary[g];
                }

            }
            String str = Conversion;

            String Output1 = ASCIIConvert(Conversion);

            String Part1 = Conversion.substring(0,6);
            String Part2 = Conversion.substring(6);
            System.out.print("ASCII Sentence: 1-800-" +Part1 +'-' +Part2);
        }
    }
}

