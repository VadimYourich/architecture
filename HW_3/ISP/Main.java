public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(11);
        Triangle triangle = new Triangle(1,2,3);
        printVolume(sphere);
        printArea(sphere);
        printArea(triangle);

    }

    public static void printVolume(Shape3D shape) {
        System.out.printf("%.1f%n",shape.volume());
    }
    public static void printArea(Shape shape) {
        System.out.printf("%.1f%n",shape.area());
    }
}