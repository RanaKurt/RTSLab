package RTSLab;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class RTSLabDriver {
    public static void main(String[] args) throws InterruptedException{
//        1. Create a new class (RTSLabs)
//        2. Navigate to "https://www.google.com/"
//        3. Select the main search box and enter the text "RTS Labs"
//        4. Click "Google Search Box"
//        5. Click the first result URL from the search
//        6. Close the page

        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.Navigate to "https://www.google.com/"
        driver.navigate().to("http://www.google.com");

        //3.Select the main search box and enter the text "RTS Labs"
        //4. Click "Google Search Box"
        WebElement searchBox=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBox.sendKeys("RTS Labs"+ Keys.ENTER);

        //5. Click the first result URL from the search
        driver.findElement(By.xpath("//a[@href='https://rtslabs.com/']")).click();

        //6. Close the page
        driver.close();
    }
}
