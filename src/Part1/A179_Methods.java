package Part1;

public class A179_Methods {

    public static String reverse(String input) {
        String str = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            str += input.charAt(i);
        }

        return str;
    }

}
