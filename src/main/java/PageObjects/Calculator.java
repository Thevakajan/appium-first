package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Calculator {
    AndroidDriver<MobileElement> driver;

    By oneclick = By.id("com.android.calculator2:id/digit_1");

    By mul = By.id("com.android.calculator2:id/op_mul");

    By three = By.id("com.android.calculator2:id/digit_3");

    public Calculator(AndroidDriver<MobileElement> driver) {

        this.driver = driver;

    }

    public void clickone() {

        driver.findElement(oneclick).click();

    }

    public void clickmul() {

        driver.findElement(mul).click();

    }

    public void clickthree() {

        driver.findElement(three).click();

    }
}