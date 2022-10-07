package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition {
	private BouletcorpPage bouletcorpPage;
	public String title;
	public BouletcorpStepDefinition() {
		this.bouletcorpPage = new BouletcorpPage();

	}


	@Given("Je me connecte sur le site Bouletcorp")
	public void jeMeConnecteSurLeSiteBouletcorp() {
		bouletcorpPage.goToUrl();
		title = Setup.getDriver().getTitle();
	}
	
	@When("Je clique sur le bouton Aleatoire")
	public void jeCliqueSurLeBoutonAleatoire() {
		bouletcorpPage.clickOnAleatoire();
	}
	@Then("Je verifie que la page a channgé")
	public void jeVerifieQueLaPageAChanngé() {
    Assert.assertNotEquals(title, Setup.getDriver().getTitle());
	    
	}
	@Then("les widgets facebook, twitter et tumblr sont affichés")
	public void lesWidgetsFacebookTwitterEtTumblrSontAffichés() {
		Assert.assertTrue((bouletcorpPage.facebook.isDisplayed())&&(bouletcorpPage.twitter.isDisplayed())&&(bouletcorpPage.tumblr.isDisplayed()));
		
	  
	}

	
}
