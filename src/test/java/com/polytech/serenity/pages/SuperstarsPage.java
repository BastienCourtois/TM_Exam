package com.polytech.serenity.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.wwe.com/superstars")
public class SuperstarsPage extends PageObject {

    @FindBy(id="superstar-search-field") 
    private WebElementFacade searchTerms;

    @FindBy(id="superstar-search-button")
    private WebElementFacade lookupButton;
    
//    @FindBy(css = ".call")
//    private WebElementFacade cookieButton;
    
    public void cookie(){
    	
    	/////////////////////////
    	getDriver().switchTo().frame(5);
    	WebElement fb = this.getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/div/div[4]/a[1]"));
    	
    	Actions builder = new Actions(getDriver());
    	builder.moveToElement(fb).click().build().perform();
    	getDriver().switchTo().defaultContent();
    	////////////////////////
    	
    	
    	//cookieButton.waitUntilEnabled().and().click();
    }

    public void entrer_superstar(String superstarname) {
        searchTerms.type(superstarname);
    }

    public void rechercher_superstar() {
        lookupButton.click();
    }

    public List<String> recuperer_nom() {
        WebElementFacade definitionList = find(By.tagName("div"));
        return definitionList.findElements(By.tagName("h1")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
    public List<String> recuperer_titre() {
        WebElementFacade definitionList = find(By.className("wwe-talent__hero--label"));
        return definitionList.findElements(By.tagName("a")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
    public List<String> recuperer_image() {
        WebElementFacade definitionList = find(By.className("wwe-talent__hero--show"));
        return definitionList.findElements(By.tagName("img")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
    
    public List<String> getPageHead() {
    	WebElementFacade definitionList = find(By.tagName("p"));
    	return definitionList.findElements(By.tagName("span")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
    
    public void selectionne(String superstarname) {
    	WebElementFacade superstarList = find(By.className("superstars-search--item superstars--item nid-undefined"));
    	List<WebElement> superstarnames = superstarList.findElements(By.className("superstars--name"));
    	int i=0;
    	while(i<superstarnames.size()) {
    		if(superstarnames.get(i).getText().equalsIgnoreCase(superstarname)) {
    			superstarnames.get(i).click();
    			i=superstarnames.size();
    		}
    		i++;
    	}
    }
    
    public void champion(String championshipname) {
    	WebElementFacade championList = find(By.className("superstars-champions--info"));
    	List<WebElement> championshipnames = championList.findElements(By.className("superstars-champions--championship"));
    	int i=0;
    	while(i<championshipnames.size()) {
    		if(championshipnames.get(i).getText().equalsIgnoreCase(championshipname)) {
    			championshipnames.get(i).click();
    			i=championshipnames.size();
    		}
    		i++;
    	}
    }
    
    public void filtre(String brandname) {
    	WebElementFacade brandList = find(By.className("options"));
    	List<WebElement> brandnames = brandList.findElements(By.className("superstar-search--option"));
    	int i=0;
    	while(i<brandnames.size()) {
    		if(brandnames.get(i).getText().equalsIgnoreCase(brandname)) {
    			brandnames.get(i).click();
    			i=brandnames.size();
    		}
    		i++;
    	}
    }
    
    public void premiere_superstar() {
    	WebElementFacade superstarList = find(By.className("superstars-search--content superstarsSearch-processed"));
    	List<WebElement> superstars = superstarList.findElements(By.className("superstars-search--item superstars--item nid-undefined"));
    	superstars.get(0).click();
    }
    
}