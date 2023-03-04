package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("otwiera przegladarke Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("znajduję element w Firefox");
    }
}
