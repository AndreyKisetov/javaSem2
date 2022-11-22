    // n - четное
    // Создать строку, которая состоит из символов c1c2c1c2c1c2...c1c2, причем длина этой строки равна n

public class Main {

    public static void main(String[] args) {
        System.out.println(buildString('q','p',20));
    }

    public static String buildString(char c1, char c2, int n) {
        if (n == 0 || n % 2 != 0) {
            // return "";
            // return null;
            throw new IllegalArgumentException("Значение n " + n + " некорректное");
        }

        StringBuilder builder = new StringBuilder();
        // String res = "";
        for (int i = 0; i < n / 2; i++) {
            builder.append(c1).append(c2);
            // res += c1 + "" + c2;
        }

        return builder.toString();
    }
}
