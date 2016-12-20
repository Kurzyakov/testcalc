package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String msg1 = "Введите первое число: ";
        String msg2 = "Введите второе число: ";
        String msg3 = "Какое действие хотите совершить? + - * /";

        Scanner scanner = new Scanner(System.in);

        System.out.println(msg1);
        float a = read(scanner);
        //float a = scanner.nextFloat();

        System.out.println(msg2);
        float b = read(scanner);
        //float b = scanner.nextFloat();

        System.out.println(msg3);

        String action = scanner.next();

        String calc = calc(action, a, b);
        System.out.println(calc);


    }
    public static float read(Scanner scanner) {
        String value = scanner.next();
        float result = 0;
        try {
            result = Float.parseFloat(value);
        } catch (Exception e){
            System.out.println("Введенное значение не число");
        }
        return result;
    }

    public static String calc(String action, float a, float b) {

        String result = null;
        if (action.equals("+")) {
            result = ("Сумма " + sum(a, b));
        } else if (action.equals("-")) {
           result = ("Разность " + diff(a, b));
        } else if (action.equals("*")) {
            result = ("Произведение " + mult(a, b));
        } else if (action.equals("/")) {
            result = ("Частное " + quot(a, b));
        } else {
            result = ("Неподдерживаемая операция");
        }
        return result;


    }

    static float sum(float a, float b) {
        return a + b;
    }

    static float diff(float a, float b) {
        return a - b;
    }

    static float mult(float a, float b) {
        return a * b;
    }

    static float quot(float a, float b) {
        return a / b;
    }
    

}
