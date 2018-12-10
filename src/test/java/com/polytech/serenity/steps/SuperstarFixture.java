package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class SuperstarFixture {

    @Steps
    UtilisateurSteps utilisateur;

    @Soit("^un utilisateur sur la page superstars$")
    public void un_utilisateur_sur_la_page_d_accueil() throws Exception {
    	utilisateur.est_sur_la_homepage();
    }

    @Quand("^il cherche la superstar \"([^\"]*)\"$")
    public void il_cherche_la_superstar(String mot) throws Exception {
    	utilisateur.recherche(mot);
    }
    
    @Quand("^il sélectionne la superstar \"([^\"]*)\"$")
    public void il_sélectionne_la_superstar(String nom) throws Exception{
    	utilisateur.selectionne(nom);
    }
    
    @Quand("^il sélectionne le champion \"([^\"]*)\"$")
    public void il_sélectionne_le_champion(String nom) throws Exception{
    	utilisateur.champion(nom);
    }
    
    @Quand("^il filtre les superstars de \"([^\"]*)\"$")
    public void il_filtre_les_superstars_de(String nom) throws Exception{
    	utilisateur.filtre(nom);
    }
    
    @Quand("^il selectionne la première superstar")
    public void il_selectionne_la_premiere_superstar() throws Exception{
    	utilisateur.premiere_superstar();
    }

    @Alors("^il devrait voir le nom \"([^\"]*)\"$")
    public void il_devrait_voir_le_nom(String nom) throws Exception {
    	utilisateur.doit_voir_le_nom(nom);
    }
    
    @Alors("^il devrait voir le titre \"([^\"]*)\"$")
    public void il_devrait_voir_le_titre(String nom) throws Exception {
    	utilisateur.doit_voir_le_titre(nom);
    }
    
    @Alors("^il devrait voir le titre \"([^\"]*)\"$")
    public void il_devrait_voir_l_image(String nom) throws Exception {
    	utilisateur.doit_voir_l_image(nom);
    }
    
    @Alors("^il ne devrait pas voir le titre \"([^\"]*)\"$")
    public void il_devrait_pas_voir_l_image(String nom) throws Exception {
    	utilisateur.doit_pas_voir_l_image(nom);
    }

}
