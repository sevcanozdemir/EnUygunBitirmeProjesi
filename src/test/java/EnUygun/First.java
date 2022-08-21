package EnUygun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class First {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void goToURL(){
        //https://www.enuygun.com/ucak-bileti/ sayfasına gidelim
        driver.get("https://www.enuygun.com/ucak-bileti/");
    }

    @Test(priority = 2)
    public void origin(){
        WebElement origin= driver.findElement(By.id("OriginInput"));
        origin.sendKeys("İstanbul");
        WebElement firstOrigin=driver.findElement(By.xpath("//li[@data-suggestion-index='0']"));
        firstOrigin.click();
    }

    @Test(priority = 3)
    public void destination(){
        WebElement destination= driver.findElement(By.id("DestinationInput"));
        destination.sendKeys("Amsterdam");
        WebElement firstDestination=driver.findElement(By.xpath("//li[@data-suggestion-index='0']"));
        firstDestination.click();
    }

    @Test(priority = 4)
    @SneakyThrows
    public void departureDay() {
        WebElement departureDay = driver.findElement(By.id("DepartureDate"));
        departureDay.click();

        //This is from date picker table

        List<WebElement> cellsOfDepartureDate = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//td[@aria-disabled='false']")));
        //Click the today for Departure
        //DateUtil.clickGivenDay(cellsOfDepartureDate, DateUtil.getCurrentDay());
        cellsOfDepartureDate.get(2).click();

      //  driver.findElement(By.xpath("(//div[@class='CalendarDay__content'])[4]")).click();
    }

    @Test(priority = 5)
    @SneakyThrows
    public void returnDay() {
        WebElement returnDay = driver.findElement(By.id("ReturnDate"));
        returnDay.click();

        //This is from date picker table

        List<WebElement> cellsOfDepartureDate = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//td[@aria-disabled='false']")));
        //Click the today for Departure
        //DateUtil.clickGivenDay(cellsOfDepartureDate, DateUtil.getCurrentDay());
        cellsOfDepartureDate.get(2).click();

        //  driver.findElement(By.xpath("(//div[@class='CalendarDay__content'])[4]")).click();
    }

    @Test(priority = 6)
    @SneakyThrows
    public void submitButton() {
        driver.findElement(By.xpath("//button[@data-testid='formSubmitButton']")).click();
        WebElement controlText=driver.findElement(By.xpath("//span[text()='Aramayı Düzenle']"));
        Assert.assertTrue(controlText.isDisplayed());


    }
    @Test(priority = 7)
    @SneakyThrows
    public void select() {

        WebElement afterRadioButton= driver.findElement(By.xpath("//span[text()='::before']"));
        //WebElement beforeRadioButton= driver.findElement(By.xpath("//span[text()='::after']"));
        driver.findElement(By.xpath("//button[@id='tooltipTarget_0']")).click();
    }

/*
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

*/

}
