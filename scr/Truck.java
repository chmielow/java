public class Truck implements Vehicle{
    @Override
    public void go(int speed) {
        System.out.println("jade ciezarkowa z predkoscia " +speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuje ciezarowka");
    }
}
