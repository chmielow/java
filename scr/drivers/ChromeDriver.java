package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("otwieramy przegladarke za pomoca Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("wyszukujemy za pomoca Chrome");
    }
}
