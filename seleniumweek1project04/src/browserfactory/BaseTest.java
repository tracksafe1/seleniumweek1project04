package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    String baseurl;
    public static WebDriver driver;
    public void openBrowser( String baseUrl){
        driver=new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
    }
    public void closebrowser(){
        driver.quit();
    }


}
