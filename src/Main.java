import java.util.Scanner;

public class Main {
//    public static String calc(String input) {
//        String [] str = input.split(" ");
//        for (String elements : str
//             ) {
//            System.out.print(elements);
//        }
////        String result = input;
//        return str[];
//    }

    public static void main(String[] args) {
        System.out.println("Программа \"Калькулятор\".");
        System.out.println("Калькулятор производит операции с целыми римскими и арабскими числами от 1 до 10.");
        System.out.println("Возможные операции: сложение(+), вычитание(-), умножение(*) и деление(/).");
        System.out.print("Введите выражение через пробел: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputStr = input.split(" ");


        for (int i = 0; i < inputStr.length; i++) {
            if (inputStr[i].equals("+")) {
                int res = Short.parseShort(inputStr[i - 1]) + Short.parseShort(inputStr[i + 1]);
                System.out.println(res);
            } else if (inputStr[i].equals("-")) {
                int res = Short.parseShort(inputStr[i - 1]) - Short.parseShort(inputStr[i + 1]);
                System.out.println(res);
            } else if (inputStr[i].equals("*")) {
                int res = Short.parseShort(inputStr[i - 1]) * Short.parseShort(inputStr[i + 1]);
                System.out.println(res);
            } else if (inputStr[i].equals("/")) {
                int res = Short.parseShort(inputStr[i - 1]) / Short.parseShort(inputStr[i + 1]);
                System.out.println(res);


//        System.out.println(calc(input))
            }
        }

    }
}