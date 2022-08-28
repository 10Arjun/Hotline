// Java implementation for converting
// a string into it's ASCII equivalent senten

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

class Hotline {

    static void ASCIIConvert(String str) {
        int l = str.length();
        int convertASCII;
        char[] ch = str.toCharArray();
        String newStr = "";
        for (int i = 0; i < 7; i++) {
            convertASCII = str.charAt(i);
            System.out.print(convertASCII);
            newStr += ch[i];
       }
    }


    // Driver function
    public static void main(String[] args) {
        boolean Running = true;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input the hotline you would like to contact");
            String Conversion = sc.next();
            char[] Temporary = Conversion.toCharArray();

            String siu = "";

            for (int g = 0; g < Temporary.length; g++){
                if (Temporary[g] != ' ')
                {
                    siu = siu + Temporary[g];
                }

            }
            System.out.println(siu);
//            String str = Conversion;
//            Conversion = Conversion.toUpperCase();
//            System.out.print("ASCII Sentence: 1-800-");
//            ASCIIConvert(Conversion);
//            System.out.println();
        }
    }
