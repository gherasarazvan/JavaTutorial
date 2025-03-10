package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tema2
{
    public WebDriver driver;

    @Test
    public void contactForm()
    {
        driver= new ChromeDriver();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        driver.manage().window().maximize();

        WebElement firstNameElement = driver.findElement(By.name("first_name"));
        String firstNameValue = "Gherasă";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = driver.findElement(By.name("last_name"));
        String lastNameValue = "Răzvan";
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = driver.findElement(By.name("email"));
        String emailValue = "razvangherasa@yahoo.com";
        emailElement.sendKeys(emailValue);

        WebElement messageElement = driver.findElement(By.name("message"));
        String messageValue = "Salutare! Eu sunt Răzvan.";
        messageElement.sendKeys(messageValue);

        WebElement editEmailElement = driver.findElement(By.name("email"));
        emailElement.clear();
        String editEmailValue = "razvan@gmail.com";
        emailElement.sendKeys(editEmailValue);

//        WebElement contactElement = driver.findElement(By.className("contact_button"));
//        contactElement.click();


    }

    @Test
    public void calculator()
    {
        driver = new ChromeDriver();
        driver.get("https://www.automationtesting.co.uk/calculator.html");
        driver.manage().window().maximize();

        WebElement button7 = driver.findElement(By.xpath("//input[@type='button' and @value='7']"));
        button7.click();

        WebElement buttonPlus = driver.findElement(By.xpath("//input[@type='button' and @value='+']"));
        buttonPlus.click();

        WebElement button2 = driver.findElement(By.xpath("//input[@type='button' and @value='2']"));
        button2.click();

        WebElement buttonEqual = driver.findElement(By.xpath("//input[@type='button' and @value='=']"));
        buttonEqual.click();

        WebElement buttonDivide = driver.findElement(By.xpath("//input[@type='button' and @value='/']"));
        buttonDivide.click();

        WebElement button3 = driver.findElement(By.xpath("//input[@type='button' and @value='3']"));
        button3.click();

        buttonEqual.click();

        WebElement buttonSubtract = driver.findElement(By.xpath("//input[@type='button' and @value='-']"));
        buttonSubtract.click();

        button2.click();

        buttonEqual.click();

        WebElement buttonClear = driver.findElement(By.xpath("//input[@type='button' and @value='c']"));
        buttonClear.click();
    }
}