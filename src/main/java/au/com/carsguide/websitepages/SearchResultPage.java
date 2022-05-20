package au.com.carsguide.websitepages;

import au.com.carsguide.utility.Utilites;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends Utilites {
    public static final Logger log = Logger.getLogger(SearchResultPage.class.getName());

    public SearchResultPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class=\"listing-search-title\"]")
    WebElement searchresultCarText;

    public String getVerifyNewCarSearchText(){
        log.info("get the text of car search result car : " + searchresultCarText.toString());
        return getTextFromElement(searchresultCarText);
    }


}
