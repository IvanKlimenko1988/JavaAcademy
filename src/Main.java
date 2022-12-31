import java.util.Scanner;

public class Main {
    public static String calc(String input) {
        String[] charArray = input.split(" ");
        int result = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i].equals("+")) {
                result = Short.parseShort(charArray[i - 1]) + Short.parseShort(charArray[i + 1]);
            } else if (charArray[i].equals("-")) {
                result = Short.parseShort(charArray[i - 1]) - Short.parseShort(charArray[i + 1]);
            } else if (charArray[i].equals("*")) {
                result = Short.parseShort(charArray[i - 1]) * Short.parseShort(charArray[i + 1]);
            } else if (charArray[i].equals("/")) {
                result = Short.parseShort(charArray[i - 1]) / Short.parseShort(charArray[i + 1]);
            }
        }
        return Integer.toString(result);
    }

    public static boolean isDigit(String input) {
        try {
            Short.parseShort(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInputString(String string) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ')
                count++;
            else if (count == 2)
                result = true;
            else if (i == string.length() - 1)
                result = false;
        }
        return result;
    }

    public static boolean inRangeNumber(String input) {
        String[] charArray = input.split(" ");
        int count = 0;
        boolean isNum;
        for (int i = 0; i < charArray.length; i++) {
            isNum = isDigit(charArray[i]);
            if (isNum) {
                int num = Short.parseShort(charArray[i]);
                if (num > 0 && num <= 10)
                    continue;
                else
                    count++;
            }
        }
        if (count > 0)
            return false;
        else return true;
    }

    public static boolean checkRoman(String input) {
        String[] temp = input.split(" ");
        String[] romanNum = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int countR = 0;
        boolean checkRoman = false;
        for (int i = 0; i < romanNum.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals(romanNum[i]))
                    countR++;
            }
        }
        if (countR == 2)
            checkRoman = true;
        return checkRoman;
    }

    public static boolean checkArabic(String input) {
        String[] temp = input.split(" ");
        String[] arabicNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int countA = 0;
        boolean checkArabic = false;
        for (int i = 0; i < arabicNum.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals(arabicNum[i]))
                    countA++;
            }
        }
        if (countA == 2)
            checkArabic = true;
        return checkArabic;
    }

    public static String convertToArabic(String input) {
        String[] temp = input.split(" ");
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("I"))
                result += "1 ";
            else if (temp[i].equals("II"))
                result += "2 ";
            else if (temp[i].equals("III"))
                result += "3 ";
            else if (temp[i].equals("IV"))
                result += "4 ";
            else if (temp[i].equals("V"))
                result += "5 ";
            else if (temp[i].equals("VI"))
                result += "6 ";
            else if (temp[i].equals("VII"))
                result += "7 ";
            else if (temp[i].equals("VIII"))
                result += "8 ";
            else if (temp[i].equals("IX"))
                result += "9 ";
            else if (temp[i].equals("X"))
                result += "10 ";
            else if (temp[i].equals("+"))
                result += "+ ";
            else if (temp[i].equals("-"))
                result += "- ";
            else if (temp[i].equals("*"))
                result += "* ";
            else if (temp[i].equals("/"))
                result += "/ ";
        }
        return result;
    }

    public static String convertToRoman(String input) {
        int inputInt = Integer.parseInt(input);
        String result = "";
        if (inputInt >= 10) {
            int amountTen = inputInt;
            while (amountTen > 10) {
                amountTen /= 10;
            }
            if (amountTen <= 3)
                while (amountTen > 0) {
                    result += "X";
                    amountTen--;
                }
            else if (inputInt == 10) {
                result = "X";
            }
        }
        int div = inputInt;


        while (div > 10) {
            div %= 10;
        }
        System.out.println(div);
        if (div <= 3)
            while (div > 0) {
                result += "I";
                div--;
            }
        else if (div == 4) {
            result = "IV";
        } else if (div == 5) {
            result = "V";
        }

//        System.out.println(result);

//        if (inputInt % 100 == 0)
//            result = "C";
//        else if (inputInt % 50 == 0)
//            result = "L";
//        else if (inputInt % 10 == 0)
//            result = "X";


        return result;
    }


    public static void main(String[] args) {
        System.out.println("Программа \"Калькулятор\".");
        System.out.println("Калькулятор производит операции с целыми римскими и арабскими числами от 1 до 10.");
        System.out.println("Возможные операции: сложение(+), вычитание(-), умножение(*) и деление(/).");
        System.out.print("Введите выражение через пробел: ");

        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

//            if (isInputString(input))
//                System.out.println("ok");
//            else System.out.println("not ok");
//            if (inRangeNumber(input))
//                System.out.println("ok range");
//            else System.out.println("not ok range");

            if (checkRoman(input)) {
                String arabic = convertToArabic(input);
                String resArabic = calc(arabic);
                System.out.println(resArabic);
                System.out.println("Roman ok");
                System.out.println(convertToRoman(resArabic));
            } else System.out.println("Roman not ok");

            if (checkArabic(input)) {
                System.out.println("Arabic ok");
                System.out.println(calc(input));
            } else System.out.println("Arabic not ok");


        } catch (NumberFormatException e) {
            System.out.println("Введите целое число!");
        }


    }


}
