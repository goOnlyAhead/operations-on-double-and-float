import java.util.Scanner;

class Main {

    private static final String EXIT_PROGRAM = "4";

    public static void printDelim() {
        System.out.println("-------------------------------\n" +
                "Операции над double и float:\n" +
                "1. Сравнить\n" +
                "2. Округлить\n" +
                "3. Отбросить дробную часть\n" +
                "4. Выход\n" +
                "------------------------------- ");
    }

    public static void main(String[] args) {
        double doubleValue;
        float floatValue;
        Scanner scanner = new Scanner(System.in);
        printDelim();
        while (true) {
            try {
                String input = scanner.nextLine();
                int operation = Integer.parseInt(input);
                if (input.equals(EXIT_PROGRAM)) {
                    break;
                }
                switch (operation) {
                    case 1:
                        System.out.println("Введите первое число (double) :");
                        String stringOneDouble = scanner.nextLine();
                        doubleValue = Double.parseDouble(stringOneDouble);
                        System.out.println("Введите второе число (float) :");
                        String stringFloat = scanner.nextLine();
                        floatValue = Float.parseFloat(stringFloat);
                        comparisonOfNumbers(doubleValue, floatValue);
                        printDelim();
                        break;
                    case 2:
                        System.out.println("Введите число :");
                        String stringTwoDouble = scanner.nextLine();
                        floatValue = Float.parseFloat(stringTwoDouble);
                        roundingTheNumber(floatValue);
                        printDelim();
                        break;
                    case 3:
                        System.out.println("Введите число :");
                        String stringThreeDouble = scanner.nextLine();
                        floatValue = Float.parseFloat(stringThreeDouble);
                        remainderAfterPoint(floatValue);
                        printDelim();
                        break;
                    default:
                        System.out.println("Такой операции нет");
                        printDelim();
                        break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Ошибка ввода, вы ввели не число");
                System.out.println("Выберете категорию");
                printDelim();
            }
        }
    }

    public static void comparisonOfNumbers(double doubleValue, float floatValue) {
        if (Math.abs(floatValue - doubleValue) < 0.0001) {
            System.out.println("Числа равны");
        } else if (doubleValue > floatValue) {
            System.out.println("Числа не равны, первое число " + doubleValue + " больше");
        } else {
            System.out.println("Числа не равны, второе число " + floatValue + " больше");
        }
    }

    public static void roundingTheNumber(float floatValue) {
        int result = Math.round(floatValue);
        System.out.println("Результат округления " + result);
    }

    public static void remainderAfterPoint(float floatValue) {
        int result = (int) floatValue;
        System.out.println("Результат отброса дробной части " + result);
    }


}