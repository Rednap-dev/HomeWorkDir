package Snow;

import java.util.Scanner;

public class Cube extends Figure implements Square {
    @Override
    public int getPer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны квадрата: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int resultCube = (a + b) * 2;
        return resultCube;
    }

    @Override
    public void getSquare() {
        super.getSquare();
    }
}
