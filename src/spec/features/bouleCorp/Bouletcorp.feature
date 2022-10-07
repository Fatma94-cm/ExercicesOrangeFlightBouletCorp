Feature: Fonctionnalité Aleatoire
  En tant que utilisateur je veux cliquer sur aléatoire a fin de changer la page et 
  de verifier que les widgets sont presents

  @Aleatoire
  Scenario: Fonctionnalité Aleatoire
    Given Je me connecte sur le site Bouletcorp
    When Je clique sur le bouton Aleatoire
    Then Je verifie que la page a channgé
    And les widgets facebook, twitter et tumblr sont affichés
