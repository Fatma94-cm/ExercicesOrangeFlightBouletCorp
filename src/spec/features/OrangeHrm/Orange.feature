@Orange
Feature: Authentification sur le site orange
  En tant que utilisateur je souhaite me connecter sur le site Orange

  Background: 
    Given Je me connecte au site Orange
    When Je saisi mon userName "Admin"
    And Je saisi mon passWord "admin123"
    And Je clique sur le bouton login

  @login
  Scenario: connection au site Orange
    Then Je me redirige vers mon compte "PIM"
    
    @Add
     Scenario: ajouter employe
     When Je clique sur le bouton Add "Add"
     And Je saisie le nom de l employe
     And Je saisie le prenom de l employe
     And Je saisie l id de l employe
     And Je clique sur le bouton save 
     Then Je verifie l ajout de l employe  

  @logout
  Scenario: deconnection au site Orange
    When Je clique sur l icone du proprietaire du compte
    When Je clique sur le boutton logout
    Then Je me redirige vers la page home "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"