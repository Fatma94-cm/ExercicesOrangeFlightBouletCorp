package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class OrangePage {
	
	private ConfigFileReader configFileReader; 
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using ="//*[@name='username']")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	public static WebElement btnLogin;
	@FindBy(how = How.LINK_TEXT, using ="PIM")
	public static WebElement message;
	@FindBy(how = How.XPATH, using ="//*[@alt='profile picture']")
	public static WebElement profile;
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Logout')]")
	public static WebElement btnLogout; 
	@FindBy(how = How.XPATH, using ="//*[@type='button']")
	public static WebElement btnAdd; 
	@FindBy(how = How.XPATH, using ="//*[@name='firstName']")
	public static WebElement firstName;
	@FindBy(how = How.XPATH, using ="//*[@name='lastName']")
	public static WebElement lastName;
	@FindBy(how = How.XPATH, using ="//*[@class='oxd-input oxd-input--active']")
	public static WebElement employeeId;
	@FindBy(how = How.XPATH, using ="//*[@type='submit']")
	public static WebElement btnSave;
	
	public OrangePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Create Method */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.orange"));
	}

	public void fillUserName(String name) throws InterruptedException {
		Thread.sleep(6000);
		userName.sendKeys(name);
	}
	
	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	
	public void clickOnBtnLogin() {
		btnLogin.click();
	}
	
	public void clickOnProfile() {
		profile.click();
	}
	
	public void clickOnBtnLogout() {
		btnLogout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
