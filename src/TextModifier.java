import java.util.Scanner;

public class TextModifier {
    public static String textModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        // Step A: Удаляем лишние пробелы между словами
        StringBuilder noExtraSpaces = new StringBuilder();
        boolean isPrevSpace = false;

        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                if (!isPrevSpace) {
                    noExtraSpaces.append(ch);
                    isPrevSpace = true;
                }
            } else {
                noExtraSpaces.append(ch);
                isPrevSpace = false;
            }
        }

        // Step B: Меняем местами символы вокруг знака минус (-)
        StringBuilder swappedText = new StringBuilder();
        for (int i = 0; i < noExtraSpaces.length(); i++) {
            char ch = noExtraSpaces.charAt(i);
            if (ch == '-' && i > 0 && i < noExtraSpaces.length() - 1) {
                // Меняем символы местами
                swappedText.setCharAt(swappedText.length() - 1, noExtraSpaces.charAt(i + 1));
                swappedText.append(noExtraSpaces.charAt(i - 1));
                i++; // Пропустить символ справа от "-"
            } else {
                swappedText.append(ch);
            }
        }

        // Step C: Заменяем все плюсы (+) на восклицательные знаки (!)
        StringBuilder replacedText = new StringBuilder();
        for (int i = 0; i < swappedText.length(); i++) {
            char ch = swappedText.charAt(i);
            if (ch == '+') {
                replacedText.append('!');
            } else {
                replacedText.append(ch);
            }
        }

        // Step D: Удаляем цифры, суммируем их и добавляем сумму в конце строки
        StringBuilder finalText = new StringBuilder();
        int sumOfDigits = 0;

        for (int i = 0; i < replacedText.length(); i++) {
            char ch = replacedText.charAt(i);
            if (Character.isDigit(ch)) {
                sumOfDigits += Character.getNumericValue(ch);
            } else {
                finalText.append(ch);
            }
        }

        // Добавляем сумму цифр в конце через пробел, если сумма больше 0
        if (sumOfDigits > 0) {
            finalText.append(" ").append(sumOfDigits);
        }

        return finalText.toString();
    }

    public static void main(String[] args) {
        System.out.println(textModifier());
    }
}
