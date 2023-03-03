public class AppChecker {
    public static void main(String[] args) {
        IphoneApp iphoneApp = new IphoneApp("Calculator");
        AndroidApp androidApp = new AndroidApp("Browser");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
        androidApp.appInfo();
        androidApp.runAndroidApp();
    }
}
