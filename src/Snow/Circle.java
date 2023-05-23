package Snow;

import java.util.Scanner;

public class Circle extends Figure implements Square {
    @Override
    public int getPer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте радиус:");
        int a = scanner.nextInt();
        double h = Math.PI;
        int resultC = (int) (a * h);
        return resultC;
    }

    @Override
    public void getSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте радиус:");
        int a = scanner.nextInt();
        double h = Math.PI;
        double resultC = (a * a) * h;
        System.out.println("Площадь равна: " + resultC);
    }
}
