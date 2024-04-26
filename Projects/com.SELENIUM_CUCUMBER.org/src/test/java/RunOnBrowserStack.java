import org.openqa.selenium.remote.DesiredCapabilities;

public class RunOnBrowserStack {
	
	public static final String USERNAME = "shoryabeohar_xPozbC";
    public static final String AUTOMATE_KEY = "mrsahaH6sJoySYHYH1ya";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +
            "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("name", "TestRunner");        
        
        

    }
}
