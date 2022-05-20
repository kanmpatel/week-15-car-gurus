package au.com.carsguide.websitepages;

import au.com.carsguide.utility.Utilites;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilites {
    public static final Logger log = Logger.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySellTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCarsLink;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Used']")
    WebElement usedLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makeDropDown;

    public void mouseHoverOnBuySellTab() throws InterruptedException {
        log.info("Mouse Hover on buy sell tab:" + buySellTab.toString());
        mouseHoverToElement(buySellTab);
    }

    public void clickOnSearchCarLink(){
        log.info("Link On search Cars link:" + searchCarsLink.toString());
        mouseHoverToElementAndClick(searchCarsLink);
    }

    public void clickOnUsedLink(){
        log.info("Link On Used Link:" + usedLink.toString());
        mouseHoverToElementAndClick(usedLink);
    }

    public void selectMakeFromDropDown(String make){
         log.info("select the make for car from drop down " + make);
         selectByVisibleTextFromDropDown(makeDropDown,make);
    }


}
