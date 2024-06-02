public class Main {
    public static void main(String[] args) {
        Car car = new Car ("BMW", "m5", 2023, 450, 150);
        Truck truck = new Truck("Yoyota", "c6", 2020, 1000, 500, 3102);
        System.out.println("Fuel consumption of car: " + String.format("%.2f", car.calculateFuelEfficiency()));
        System.out.println("Fuel consumption of truck: " + String.format("%.2f", truck.calculateFuelEfficiency()));

    }
}
