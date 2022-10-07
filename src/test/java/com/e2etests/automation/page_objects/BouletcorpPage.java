package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class BouletcorpPage {
	
	private ConfigFileReader configFileReader;
	
	/* @FindBy */
	@FindBy(how = How.LINK_TEXT, using = "Aléatoire")
	public static WebElement aleatoire;
	@FindBy(how = How.XPATH, using="//img[@title='Facebook']")
	public  WebElement facebook;
	@FindBy(how = How.XPATH, using="//img[@title='Twitter']")
	public  WebElement twitter;
	@FindBy(how = How.XPATH, using="//a[@title='Share on Tumblr']")
	public  WebElement tumblr;
	
	public BouletcorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Create Method */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	
	public void clickOnAleatoire() {
		aleatoire.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
