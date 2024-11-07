//Необходимо написать метод, который принимает два числа в качестве аргументов
// и возвращает строку с информацией о том, какое число больше - первое, второе или они равны.
// Затем в main считать из консоли два числа от пользователя и вызвать метод с этими значениями
// и вывести результат в консоль.

import java.util.Scanner;
//
//public class Main {
//    public static String Numbers(int a, int b) {
//        if (a > b) {
//            System.out.println(a + " > " + b);
//        } else if (a < b) {
//            System.out.println(a + " < " + b);
//        } else {
//            System.out.println(a + " = " + b);
//        }
//        return" ";
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int number1 = scanner.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int number2 = scanner.nextInt();
//
//        String result = Numbers(number1, number2);
//        System.out.println(result);
//
//        scanner.close();
//    }
//}

// МЕТОДЫ урок 15
//public class Main {
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Роман";
//        person1.age = 50;
//        person1.sayHello();
//        Person person2 = new Person();
//        person2.name = "Вова";
//        person2.age = 20;
//        person2.speak();
//        person2.sayHello();
//    }
//}
//class Person{
//    String name;
//    int age;
//
//    void speak(){
//        for (int i=0; i<3; i++) {
//        System.out.println("Меня зовут "+name+ ", мне "+age+ "лет.");}
//        }
//    void sayHello(){
//        System.out.println("Привет!");
//    }
//}
//Тип возвращаемого значения метода
//public class Main {
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Роман";
//        person1.age = 50;
//        Person person2 = new Person();
//        person2.name = "Вова";
//        person2.age = 20;
//        int year1 = person1.calculatorAge();
//        int year2 = person2.calculatorAge();
//        System.out.println("Первому человеку до пенсии: "+year1);
//        System.out.println("Второму человеку до пенсии: "+year2);
//    }
//}
//class Person{
//    String name;
//    int age;
//
//    int calculatorAge() {
//        int years = 65-age;
//        return years;
//    }
//    void speak(){
//        for (int i=0; i<3; i++) {
//        System.out.println("Меня зовут "+name+ ", мне "+age+ "лет.");}
//        }
//    void sayHello(){
//        System.out.println("Привет!");
//    }
//}
// Вычислить периметр прямоугольника
//public class Main {
//    public static void main(String[] args){
//        double a,b;
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("a ="); a = in.nextDouble();
//        System.out.print("b ="); b = in.nextDouble();
//
//        double p = 2*(a+b);
//        System.out.println(p);
//        in.close();
//    }
//}
// деление двух целочисленных значений
//public class Main {
//    public static void main(String[] args){
//        int a = 7;
//        int b = 2;
//        double c = (double) a/b;
//        System.out.println(c);
//    }
//}
public class Main {
    public static void main(String[] args){
        int number = 10; //примитивный тип данных   //[10]
        int[] numbers = new int[5]; //numbers -> [массив] ссылочный тип данных
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = i*10;
        }
        for (int i=0;i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(); //просто вывод пустой строки
        int[] numbers1 = {1,2,3,4,5};
        for (int i=0;i<numbers.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}