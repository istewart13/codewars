// This time no story, no theory. The examples below show you how to write function accum:

// Examples:

// Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
// Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
// The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Accumul {
    
    public static String accum(String s) {
     String result = "";
     for (int i = 0; i < s.length(); i++) {
       char currentChar = s.charAt(i);
       for (int j = 0; j <= i; j++) {
         if (j == 0) {
           result += Character.toUpperCase(currentChar);
         } else {
           result += Character.toLowerCase(currentChar);
         } 
       }
       result += "-";
     }
     return result.substring(0, result.length()-1);
    }
}