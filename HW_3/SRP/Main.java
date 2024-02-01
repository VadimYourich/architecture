public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(220);
        System.out.println(vehicle);
        vehicle = new Bus(160);
        System.out.println(vehicle);
        vehicle = new Vehicle(220, "vehicle");
        System.out.println(vehicle);


    }
}