package com.bridgelabz.page;

import com.bridgelabz.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PunePortalLink extends Base {
    @FindBy(xpath = "//*[@id=\"post-5890\"]/div/table[1]/tbody/tr[7]/td[2]/a/strong")
    WebElement maharashtraStateLink;

    @FindBy(xpath = "//a[text() = 'Pune police portal.']")
    WebElement punePortalLink;

    public PunePortalLink(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void getStateLink() throws InterruptedException {
        //JavascriptExecutor here is used to scroll the window
        //window is scrolled downwards by 1000 pixel
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2100)");
        Thread.sleep(5000);
        maharashtraStateLink.click();
        Thread.sleep(5000);
        punePortalLink.click();
        Thread.sleep(2000);
    }

}
