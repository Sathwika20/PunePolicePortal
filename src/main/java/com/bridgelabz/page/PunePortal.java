package com.bridgelabz.page;

import com.bridgelabz.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class PunePortal extends Base {
    public Robot robot = new Robot();
    public Actions actions = new Actions(driver);

    @FindBy(xpath = "//*[@id=\"CategoryReason\"]")
    WebElement selectDepartment;

    @FindBy(xpath = "//*[@id=\"CategoryReason\"]/option[6]")
    WebElement department;

    @FindBy(xpath = "//input[@id = 'FullName']")
    WebElement name;

    @FindBy(xpath = "//input[@id = 'Hospital_Name']")
    WebElement officeID;

    @FindBy(xpath = "//input[@id = 'ImageFile']")
    WebElement choosePhoto;

    @FindBy(xpath = "//*[@id=\"Bonafide\"]")
    WebElement chooseBonafide;

    @FindBy(xpath = "//*[@id=\"OfficeID\"]")
    WebElement chooseOfficeId;

    @FindBy(xpath = "//*[@id=\"Sex\"]")
    WebElement gender;

    @FindBy(xpath = "//*[@id=\"Sex\"]/option[3]")
    WebElement female;

    @FindBy(xpath = "//input[@id = 'DOB']")
    WebElement DOB;

    @FindBy(xpath = "//input[@id = 'MobileNo']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@id = 'AirPort_FlightNo']")
    WebElement adharNumber;

    @FindBy(xpath = "//*[@id=\"FromDateTime\"]")
    WebElement fromDate;

    @FindBy(xpath = "//input[@id = 'ToDateTime']")
    WebElement toDate;

    @FindBy(xpath = "//*[@id=\"Other_FromLocation\"]")
    WebElement fromLocation;

    @FindBy(xpath = "//*[@id=\"Other_FromLocation\"]/option[2]")
    WebElement fromLocationName;

    @FindBy(xpath = "//*[@id=\"Other_ToLocation\"]")
    WebElement toLocation;

    @FindBy(xpath = "//*[@id=\"Other_ToLocation\"]/option[5]")
    WebElement toLocationName;

    @FindBy(xpath = "//*[@id=\"Hospital_Aliment\"]")
    WebElement remarks;

    @FindBy(xpath = "//input[@id = 'ResidenceCertificate']")
    WebElement selfDeclarationForm;

    @FindBy(xpath = "//*[@id=\"Hospital_SufferingOrAssist\"]")
    WebElement checkBox;

    public PunePortal(WebDriver driver) throws AWTException {
        PageFactory.initElements(driver,this);
    }
    public void select_department() throws InterruptedException {
        selectDepartment.click();
        Thread.sleep(4000);
        department.click();
        Thread.sleep(2000);
    }
    public void enter_name() throws InterruptedException {
        name.click();
        name.sendKeys("Sathwika");
        Thread.sleep(2000);
    }
    public void enter_officeID() throws InterruptedException {
        officeID.click();
        officeID.sendKeys("123456");
        Thread.sleep(3000);
    }
    public void upload_photo() throws InterruptedException {
        actions.moveToElement(choosePhoto).click().build().perform();
        Thread.sleep(2000);
        StringSelection photo = new StringSelection("file:///C:/Users/gopir/Sathwikanqt.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photo, null);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }
    public void upload_bonafide() throws InterruptedException {
        actions.moveToElement(chooseBonafide).click().build().perform();
        Thread.sleep(2000);
        StringSelection bonafide = new StringSelection("file:///C:/Users/gopir/Sathwikanqt.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(bonafide, null);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }
    public void upload_officeID() throws InterruptedException {
        actions.moveToElement(chooseOfficeId).click().build().perform();
        Thread.sleep(2000);
        StringSelection officeID = new StringSelection("file:///C:/Users/gopir/Sathwikanqt.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(officeID, null);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }
    public void select_gender() throws InterruptedException {
        gender.click();
        female.click();
        Thread.sleep(2000);
    }
    public void enter_dob() throws InterruptedException {
        DOB.click();
        DOB.sendKeys("05-03-1999");
        Thread.sleep(2000);
    }
    public void enter_mobileNumber() throws InterruptedException {
        mobileNumber.click();
        mobileNumber.sendKeys("9867453671");
        Thread.sleep(2000);
    }
    public void enter_adharNumber() throws InterruptedException {
        adharNumber.click();
        adharNumber.sendKeys("743275326295");
        Thread.sleep(2000);
    }
    public void set_fromDate() throws InterruptedException {
        fromDate.click();
        fromDate.sendKeys("08-08-2021");
        Thread.sleep(2000);
    }
    public void set_toDate() throws InterruptedException {
        toDate.click();
        toDate.sendKeys("10-08-2021");
        Thread.sleep(2000);
    }
    public void set_fromLocation() throws InterruptedException {
        fromLocation.click();
        Thread.sleep(2000);
        fromLocationName.click();
    }
    public void set_toLocation() throws InterruptedException {
        toLocation.click();
        Thread.sleep(2000);
        toLocationName.click();
    }
    public void enter_remarks() throws InterruptedException {
        remarks.click();
        remarks.sendKeys("Nothing");
        Thread.sleep(2000);
    }
    public void upload_file() throws InterruptedException {
        actions.moveToElement(selfDeclarationForm).click().build().perform();
        Thread.sleep(2000);
        StringSelection officeID = new StringSelection("file:///C:/Users/gopir/Sathwikanqt.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(officeID, null);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }
    public void click_checkBox() throws InterruptedException {
        checkBox.click();
        Thread.sleep(2000);
    }
}
