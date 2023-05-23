package Snow;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Cube();
        figures[1] = new Rectangle();
        figures[2] = new Circle();
        figures[3] = new Triangle();
        int perCube = 0;
        int perRect = 0;
        int perRound = 0;
        int perEllipse = 0;
        for (int i = 0; i <= figures.length; i++) {
            if (i == 0) {
                perCube = figures[i].getPer();
                System.out.println("Периметр квадрата: " + perCube);
            } else if (i == 1) {
                perRect = figures[i].getPer();
                System.out.println("Периметр прямоугольника: " + perRect);
            } else if (i == 2) {
                perRound = figures[i].getPer();
                System.out.println("Периметр круга: " + perRound);
            } else if (i == 3) {
                perEllipse = figures[i].getPer();
                System.out.println("Периметр треугольника: " + perEllipse);
                int result = perCube + perRect + perRound + perEllipse;
                System.out.println("Общий Периметр: " + result);
            }
        }
    }

}
