package com.e2etests.automation.step_definitions;

import org.junit.Assert;



import com.e2etests.automation.page_objects.OrangePage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrangeStepDefinition {
 
	private OrangePage orangePage;
	public OrangeStepDefinition() {
		this.orangePage = new OrangePage();}
	

	@Given("Je me connecte au site Orange")
	public void jeMeConnecteAuSiteOrange() {
		orangePage.goToUrl();
		
	}
	
	@When("Je saisi mon userName {string}")
	public void jeSaisiMonSerName(String name) throws InterruptedException {
		orangePage.fillUserName(name);
	
	}
	
	@When("Je saisi mon passWord {string}")
	public void jeSaisiMonPassWord(String passwordText) {
		orangePage.fillPassword(passwordText);
	}
	
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		orangePage.clickOnBtnLogin();  
	}
	
	@Then("Je me redirige vers mon compte {string}")
	public void jeMeRedirigeVersMonCompte(String text) {
		String message = OrangePage.message.getText();
		Assert.assertEquals(text, message);
	    
	}

	

	@When("Je clique sur l icone du proprietaire du compte")
	public void jeCliqueSurLIconeDuProprietaireDuCompte() {
		orangePage.clickOnProfile();
	}
	
	@When("Je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout() {
		orangePage.clickOnBtnLogout(); 
	   
	}
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		String url = Setup.getDriver().getCurrentUrl();
		Assert.assertEquals(title, url );
	    
	}

	@When("Je clique sur le bouton Add {string}")
	public void jeCliqueSurLeBoutonAdd(String string) {
	    
	}
	
	@When("Je saisie le nom de l employe")
	public void jeSaisieLeNomDeLEmploye() {
	    
	}
	@When("Je saisie le prenom de l employe")
	public void jeSaisieLePrenomDeLEmploye() {
	    
	}
	@When("Je saisie l id de l employe")
	public void jeSaisieLIdDeLEmploye() {
	    
	}
	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
	   
	}
	@Then("Je verifie l ajout de l employe")
	public void jeVerifieLAjoutDeLEmploye() {
	    
	}






}
