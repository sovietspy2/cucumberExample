public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
    }

    public static Integer getBiggerNumber(Integer a, Integer b) {
        try {
            return a > b ? a : b;
        } catch (Exception e) {
            return 0;
        }
    }

    public static String getCapitalizedString(String text) {
        try {
            return text.toUpperCase();
        } catch (NullPointerException e) {
            return "";
        }
    }


}
