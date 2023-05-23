package Snow;

public class Figure implements Square {
    @Override
    public void getSquare() {
        System.out.println("Площадь");
    }

    @Override
    public int getPer() {
        return 0;
    }
}
