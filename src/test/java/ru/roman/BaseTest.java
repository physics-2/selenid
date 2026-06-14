package ru.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class BaseTest {
    /*

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    @Test
    public void Test(){
        Duration second;
        webDriver = new ChromeDriver();
        webDriverWait = new WebDriverWait(webDriver,Duration.ofSeconds(5));

        webDriver.get("https://demoqa.com/text-box");

        By usernameLocator = By.xpath("//input[@placeholder='Full Name']");
        By emailLocator = By.xpath("//input[@id='userEmail']");
        By currentAdressLocator = By.xpath("//textArea[@placeholder='Current Address']");
        By permanentAdressLocator = By.xpath("//textArea[@id='permanentAddress']");
        By buttonLocator = By.xpath("//button[@id='submit']");
        webDriver.findElement(usernameLocator).sendKeys("Roman");
        webDriver.findElement(emailLocator).sendKeys("123@gmail.ru");
        webDriver.findElement(currentAdressLocator).sendKeys("Spb");
        webDriver.findElement(permanentAdressLocator).sendKeys("Spb");
        webDriver.findElement(buttonLocator).click();

        By nameLocator = By.xpath("//p[@id = 'name']");
        By emailTextLocator = By.xpath("//p[@id = 'email']");
        By currentAddressLocator = By.xpath("//p[@id = 'currentAddress']");
        By permanentAddressLocator = By.xpath("//p[@id = 'permanentAddress']");

        System.out.println(webDriver.findElement(nameLocator).getText());
        Assertions.assertEquals("Name:Roman", webDriver.findElement(nameLocator).getText());

        Cities city = Cities.Merrut;
        States states = States.UTTARPRADESH;
        webDriver.get("https://demoqa.com/automation-practice-form");
        switch (states){
            case NCR:{
                openStates(States.NCR.selector);
                openCity(Cities.Merrut.selector);
                break;
            }
            case UTTARPRADESH:{
                openStates(States.UTTARPRADESH.selector);

                break;
            }
            case RAJASTHAN:{
                openStates(States.RAJASTHAN.selector);

                break;
            }
            case HARYANA:{
                openStates(States.HARYANA.selector);

                break;
            }
        }


        By state2Locator = By.xpath("//input[@id='react-select-3-input']");
        webDriver.findElement(state2Locator).click();
        By state3Locator = By.xpath(States.UTTARPRADESH.getSelector());
        webDriver.findElement(state3Locator).click();
        By state4Locator = By.xpath("//*[@id=\"city\"]");
        webDriver.findElement(state4Locator).click();
        By state5Locator = By.xpath(States.UTTARPRADESH.isCityInState(Cities.Merrut).selector);
        webDriver.findElement(state5Locator).click();
    }

    public void openStates(String locator){
        By state2Locator = By.xpath("//input[@id='react-select-3-input']");
        webDriver.findElement(state2Locator).click();
        By state3Locator = By.xpath(locator);
        webDriver.findElement(state3Locator).click();
    }

    public void openCity(String selector){
        By state4Locator = By.xpath("//*[@id=\"city\"]");
        webDriver.findElement(state4Locator).click();
        By state5Locator = By.xpath(selector);
        webDriver.findElement(state5Locator).click();
    }

     */
}
