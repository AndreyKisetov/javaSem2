import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите исходную строку: ");
            String source = sc.next();
            String result = compress(source);
            System.out.println("Результат: " + result);
            sc.close();
        }
    }

    // aaaabbbcdd -> a4b3c1d2
    public static String compress(String source) {
        // заводим счетчик
        // итерируемся по строке
        // если текущий символ совпадает с предыдущим, то увеличиваем счетчик
        // если нет, то сохранили в какую-то (результирующую) строку и обнулили счечик
        // в конце вернули результирующую строку
        int count = 1;
        StringBuilder builder = new StringBuilder();
        char[] chars = source.toCharArray();
        builder.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            }
            else {
                builder.append(count);
                count = 1;
                builder.append(chars[i]);
            }
        }

        builder.append(count);
        return builder.toString();
    }
}
