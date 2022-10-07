Feature: Formulaire Flight
  En tant que utilisateur je souhaite remplir le formulaire Flight

  @Flight
  Scenario: Formulaire Flight
    Given Je me connecte sur le site Mercury
    When Je choisis le Type
    And Je selectionne le lieu de depart
    And Je selectionne la date de depart
    And Je selectionne le lieu de l arrivee
    And Je selectionne la date de l arrivee
    And Je choisis la classe de services
    And selectionne la Compagnie aérienne
    And Je clique sur le bouton Continue
