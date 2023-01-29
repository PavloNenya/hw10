import java.util.Locale;
import java.util.Scanner;

public class StandartStringFunctions {
    public static void main(String[] args) {
        //Stream.of(5,1,6,8,3,6,2,9).filter(x -> x > 5).map(x -> x+2).forEach(System.out::println);   //(String "One", "Two", "Three").
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
