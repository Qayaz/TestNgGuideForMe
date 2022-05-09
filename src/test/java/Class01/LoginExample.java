package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginExample {
    public static WebDriver driver;
    // to login into syntax HRMS application with following credentials
    // userName:Admin
    // password:12345
    @Test(priority = 2)
    public void invalidCredentials1(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        driver.findElement(By.id("btnLogin")).click();
        String text=driver.findElement(By.id("spanMessage")).getText();
        System.out.println("atest "+text);




    }



    //   to login into syntax HRMS application with following credentials
    //   serName:NoAdmin
    //   password:12345
    @Test(priority = 1)
    public void invalidCredentials2(){
        driver.findElement(By.id("txtUsername")).sendKeys("NoAdmin");
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        driver.findElement(By.id("btnLogin")).click();
        String text=driver.findElement(By.id("spanMessage")).getText();
        System.out.println("btest "+text);

    }
    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();

    }

}
