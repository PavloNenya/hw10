import java.util.Locale;
import java.util.Scanner;

public class Cycles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it ends with a substring: ");
        System.out.println(endedWithString(sc.nextLine(), sc.nextLine()));

        System.out.println("Enter a string to check if it contains a substring: ");
        System.out.println(contains(sc.nextLine(), sc.nextLine()));

        System.out.println("Enter a string to check if it equals with a substring: ");
        System.out.println(isEqual(sc.nextLine(), sc.nextLine()));

        System.out.println("Enter a string to check if it starts with a substring: ");
        System.out.println(startWithString(sc.nextLine(), sc.nextLine()));
    }

    /**
     * If the string str ends with the string subStr, return true, otherwise return false.
     *
     * @param str The string to be checked.
     * @param subStr The substring to search for.
     * @return The method returns a boolean value.
     */
    private static boolean endedWithString(String str, String subStr) {
        String tmp = "";
        for(int i = str.length()-subStr.length(); i < str.length(); i++) {
            tmp += str.charAt(i);
        }
        return tmp.equals(subStr);
    }

    /**
     * Returns true if the string str contains the string subStr, and false otherwise.
     *
     * @param str The string to search in.
     * @param subStr The string to search for.
     * @return boolean value
     */
    private static boolean contains(String str, String subStr) {
        int numberOfEqualChars = subStr.length();
        for(int i = 0; i < str.length(); i++) {
           for(int j = 0; j < subStr.length(); j++) {
                if(str.charAt(i) != subStr.charAt(j)) {
                    numberOfEqualChars = subStr.length();
                    break;
                }
                else {
                    numberOfEqualChars--;
                    i++;
                }
           }
            if(numberOfEqualChars == 0) return true;
        }
        return false;
    }

    /**
     * This method returns true if the two strings are equal, ignoring case.
     *
     * @param s1 The first string to compare.
     * @param s2 The string to compare to s1.
     * @return true or false
     */
    private static boolean isEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for(int i = 0; i < ch1.length; i++) {
            if(ch1[i] >= 65 && ch1[i] <= 90)
                ch1[i] += 32; // to lower case
            if(ch2[i] >= 65 && ch2[i] <= 90)
                ch2[i] += 32; // to lower case
            if(ch1[i] != ch2[i]) return false;
        }
        return true;
    }

    /**
     * Returns true if the string starts with the specified substring.
     *
     * @param str The string to be checked.
     * @param subStr The substring to search for.
     * @return boolean value
     */
    private static boolean startWithString(String str, String subStr) {
        String tmp = "";
        for(int i = 0; i < subStr.length(); i++) {
            tmp += str.charAt(i);
        }
        return tmp.equals(subStr);
    }
}
