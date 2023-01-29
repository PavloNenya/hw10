import java.util.Locale;
import java.util.Scanner;

public class StandartStringFunctions {
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
    public static boolean endedWithString(String str, String subStr) {
        return str.startsWith(subStr, str.length()-subStr.length());
    }

    /**
     * Returns true if the string str contains the string subStr, and false otherwise.
     *
     * @param str The string to search in.
     * @param subStr The string to search for.
     * @return boolean value
     */
    public static boolean contains(String str, String subStr){
        return str.contains(subStr);
    }


    /**
     * This function returns true if the two strings are equal, ignoring case.
     *
     * @param s1 The first string to compare.
     * @param s2 The string to compare to s1.
     * @return true or false
     */
    public static boolean isEqual(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    /**
     * Returns true if the string starts with the specified substring.
     *
     * @param str The string to be checked.
     * @param subStr The substring to search for.
     * @return boolean value
     */
    private static boolean startWithString(String str, String subStr) {
        return str.startsWith(subStr);
    }
}
