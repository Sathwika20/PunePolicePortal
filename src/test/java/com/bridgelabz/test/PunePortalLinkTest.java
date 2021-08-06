package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.page.PunePortal;
import com.bridgelabz.page.PunePortalLink;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class PunePortalLinkTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("click on pune portal link and go into pune portal page")
    @Test(priority = 1)
    public void get_state_link() throws InterruptedException {
        PunePortalLink portal = new PunePortalLink(driver);
        portal.getStateLink();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("selecting the department")
    @Test(priority = 2)
    public void getDepartment() throws IOException, InterruptedException, AWTException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.select_department();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("entering the name")
    @Test(priority = 3)
    public void getName() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.enter_name();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("entering the officeID")
    @Test(priority = 4)
    public void getOfficeID() throws InterruptedException, AWTException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.enter_officeID();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("uploading the valid photocopy")
    @Test(priority = 5)
    public void uploadPhoto() throws InterruptedException, AWTException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.upload_photo();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("uploading the bonafide")
    @Test(priority = 6)
    public void uploadBonafide() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.upload_bonafide();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("uploading valid officeID")
    @Test(priority = 7)
    public void uploadOfficeID() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.upload_officeID();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("selecting the gender")
    @Test(priority = 8)
    public void selectGender() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.select_gender();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("entering the valid dateOfBirth")
    @Test(priority = 9)
    public void setDOB() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.enter_dob();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("entering the valid mobileNumber")
    @Test(priority = 10)
    public void getMobileNumber() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.enter_mobileNumber();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("entering the valid adharNumber")
    @Test(priority = 11)
    public void getAdharNumber() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.enter_adharNumber();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("set the from Date")
    @Test(priority = 12)
    public void getFromDate() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.set_fromDate();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("set the return Date")
    @Test(priority = 13)
    public void getToDate() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.set_toDate();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("set the from location")
    @Test(priority = 14)
    public void getFromLocation() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.set_fromLocation();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("set the return location")
    @Test(priority = 15)
    public void getToLocation() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.set_toLocation();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("entering the remarks")
    @Test(priority = 16)
    public void getRemarks() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.enter_remarks();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("uploading the file")
    @Test(priority = 17)
    public void uploadFile() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.upload_file();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("tick the checkBox")
    @Test(priority = 18)
    public void clickCheckBox() throws AWTException, InterruptedException {
        PunePortal punePortal = new PunePortal(driver);
        punePortal.click_checkBox();
    }
}
