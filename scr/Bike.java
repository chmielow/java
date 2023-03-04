public class Bike implements Vehicle {
    @Override
    public void go(int speed) {
        System.out.println("jade rowwerem z predkoscia " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem");
    }
}
