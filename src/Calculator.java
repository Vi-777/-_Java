import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scanner.nextLine();
        scanner.close();

        try {
            System.out.println(calculate(input));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String calculate(String input) throws Exception {

        Pattern pattern = Pattern.compile("^\"([^\"]{1,10})\"\\s*([+\\-*/])\\s*(\"([^\"]{1,10})\"|[1-9]|10)$");
        Matcher matcher = pattern.matcher(input.trim());

        if (!matcher.matches()) {
            throw new Exception("Неверный формат выражения.");
        }

        String str1 = matcher.group(1);
        String operator = matcher.group(2);
        String two = matcher.group(3);
        String result;

        switch (operator) {
            case "+":

                if (!two.startsWith("\"")) {
                    throw new Exception("Неверный второй аргумент для операции сложения.");
                }
                String str2 = matcher.group(4);
                result = str1 + str2;
                break;

            case "-":

                if (!two.startsWith("\"")) {
                    throw new Exception("Неверный второй аргумент для операции вычитания.");
                }
                String ch2 = matcher.group(4);
                result = str1.replaceFirst(Pattern.quote(ch2), "");
                break;

            case "*":

                int um = Integer.parseInt(two);
                if (um < 1 || um > 10) {
                    throw new Exception("Число должно быть от 1 до 10.");
                }
                result = str1.repeat(um);
                break;

            case "/":

                int dl = Integer.parseInt(two);
                if (dl < 1 || dl > 10) {
                    throw new Exception("Число должно быть от 1 до 10.");
                }
                result = str1.substring(0, str1.length() / dl);
                break;

            default:
                throw new Exception("Операция не поддерживается.");
        }


        if (result.length() > 40) {
            result = result.substring(0, 40) + "...";
        }

        return "\"" + result + "\"";
    }
}