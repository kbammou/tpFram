import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {


    WebDriver driver;

    @Before
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void Test()
    {
        driver.get("http://www.toolsqa.com");

    }
}


