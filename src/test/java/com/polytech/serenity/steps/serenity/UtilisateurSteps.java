package com.polytech.serenity.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.IsNot.not;

import com.polytech.serenity.pages.SuperstarsPage;

import net.thucydides.core.annotations.Step;

public class UtilisateurSteps {

    SuperstarsPage superstarspage;

    @Step
    public void saisit_mot(String motCles) {
        superstarspage.entrer_superstar(motCles);
    }

    @Step
    public void lance_la_recherche() {
    	superstarspage.rechercher_superstar();
    }

    @Step
    public void est_sur_la_homepage() {
        superstarspage.open();
        superstarspage.cookie();
    }

    @Step
    public void recherche(String motCle) {
        saisit_mot(motCle);
        lance_la_recherche();
    }
    
    @Step
    public void selectionne(String motCle) {
        superstarspage.selectionne(motCle);
    }
    
    @Step
    public void champion(String mot) {
    	superstarspage.champion(mot);
    }
    
    @Step
    public void filtre(String mot) {
    	superstarspage.filtre(mot);
    }
    
    @Step
    public void premiere_superstar() {
    	superstarspage.premiere_superstar();
    }
    
    @Step
    public void doit_voir_le_nom(String nom) {
        assertThat(superstarspage.recuperer_nom(), hasItem(containsString(nom)));
    }
    
    @Step
    public void doit_voir_le_titre(String nom) {
        assertThat(superstarspage.recuperer_titre(), hasItem(containsString(nom)));
    }
    
    @Step
    public void doit_voir_l_image(String nom) {
        assertThat(superstarspage.recuperer_image(), hasItem(containsString(nom)));
    }
    
    @Step
    public void doit_pas_voir_l_image(String nom) {
        assertThat(superstarspage.recuperer_image(), not(hasItem(containsString(nom))));
    }
    
}