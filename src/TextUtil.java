import java.util.Scanner;

public class TextUtil {


    public static String textModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        if (input == null) {
            return null;
        }

        StringBuilder modifiedText = new StringBuilder();
        boolean lastWasSpace = false;

        int sumOfDigits = 0;
        StringBuilder cleanedText = new StringBuilder();


        String finalText = cleanedText.toString().trim().replaceAll("\\s+", " ");


        if (sumOfDigits > 0) {
            finalText += " " + sumOfDigits;
        }



        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                sumOfDigits += Character.getNumericValue(c);
            } else
            if (c == '-') {

                if (i > 0 && i < input.length() - 1) {

                    char leftChar = input.charAt(i - 1);
                    char rightChar = input.charAt(i + 1);
                    if(Character.isDigit(rightChar)) {
                        sumOfDigits += Character.getNumericValue(rightChar);
                        rightChar = ' ';
                    }
                    modifiedText.setCharAt(modifiedText.length() - 1, rightChar);
                    modifiedText.append(leftChar);


                    i++;
                }
            } else if (c == '+') {
                modifiedText.append('!');
            } else {

                if (c == ' ') {
                    if (!lastWasSpace) {
                        modifiedText.append(c);
                        lastWasSpace = true;
                    }
                } else {
                    modifiedText.append(c);
                    lastWasSpace = false;
                }
            }
        }


        if (sumOfDigits > 0) {
            modifiedText.append(" ").append(sumOfDigits);
        }


        finalText = modifiedText.toString().trim().replaceAll("\\s+", " ");

        return finalText;
    }
    public static void main(String[] args) {
        String result = textModifier();
        System.out.println("Измененный текст: " + result);
    }
}

//Необходимо написать метод, который принимает два числа в качестве аргументов
// и возвращает строку с информацией о том, какое число больше - первое, второе или они равны.
// Затем в main считать из консоли два числа от пользователя и вызвать метод с этими значениями
// и вывести результат в консоль.
