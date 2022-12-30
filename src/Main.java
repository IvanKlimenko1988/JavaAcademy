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
        System.out.print("Введите выражение через пробел: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        System.out.println(calc(input))
        String[] str = input.split(" ");
        for (int i = 0; i < str.length; i++) {

        }



        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+")) {
                int res = Short.parseShort(str[i - 1]) + Short.parseShort(str[i + 1]);
                System.out.println(res);
            } else if (str[i].equals("-")) {
                int res = Short.parseShort(str[i - 1]) - Short.parseShort(str[i + 1]);
                System.out.println(res);
            } else if (str[i].equals("*")) {
                int res = Short.parseShort(str[i - 1]) * Short.parseShort(str[i + 1]);
                System.out.println(res);
            } else if (str[i].equals("/")) {
                int res = Short.parseShort(str[i - 1]) / Short.parseShort(str[i + 1]);
                System.out.println(res);

            }
        }

    }
}