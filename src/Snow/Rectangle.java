package Snow;

import java.util.Scanner;

public class Rectangle extends Figure implements Square {
    @Override
    public void getSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны прямоугольника: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int resultR = a * b;
        System.out.println("Плащадь равна: " + resultR);
    }

    @Override
    public int getPer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны прямоугольника: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int resultR = (a + b) * 2;
        return resultR;
    }
}
