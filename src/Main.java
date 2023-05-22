public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Bookkeeper bookkeeper = new Bookkeeper();
        bookkeeper.printpost();
        director.printpost();
        worker.printpost();
    }
}
