package Snow;

import java.util.Scanner;

public class Triangle extends Figure implements Square {
    @Override
    public void getSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте основание и высоту:");
        int a = scanner.nextInt();
        int h = scanner.nextInt();
        int result = a * h;
        System.out.println("Плащадь равна: " + result);

    }

    @Override
    public int getPer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a + b + c;
        return result;
    }
}
