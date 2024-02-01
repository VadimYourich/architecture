public class Main {
    public static void main(String[] args) {
        QuadRangle test = new Rectangle(5, 6);
        printArea(test);
        test = new Square(7);
        printArea(test);
    }

    public static void printArea(QuadRangle quadRangle){
        System.out.println(quadRangle.area());
    }
}