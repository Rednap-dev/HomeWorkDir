package Snow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle();
        Figure triangle = new Triangle();
        Figure circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1 - Треугольник. 2 - Круг. 3 - Прямоугольник.");
        int c = scanner.nextInt();
        if (c == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите что хотите сделать: 1 - Рассчитать площадь. 2 - Найти периметр.");
            int a = scanner1.nextInt();
            if (a == 1) {
                triangle.getSquare();
            } else if (a == 2) {
                triangle.getPer();
            }
        }
        if (c == 2) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите что хотите сделать: 1 - Рассчитать площадь. 2 - Найти периметр.");
            int a = scanner1.nextInt();
            if (a == 1) {
                circle.getSquare();
            } else if (a == 2) {
                circle.getPer();
            }
        }
        if (c == 3) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите что хотите сделать: 1 - Рассчитать площадь. 2 - Найти периметр.");
            int a = scanner1.nextInt();
            if (a == 1) {
                rectangle.getSquare();
            } else if (a == 2) {
                rectangle.getPer();
            }
        }

    }

}
