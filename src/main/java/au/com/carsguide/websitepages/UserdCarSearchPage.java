package au.com.carsguide.websitepages;

import au.com.carsguide.utility.Utilites;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserdCarSearchPage extends Utilites {
    public static final Logger log = Logger.getLogger(UserdCarSearchPage.class.getName());

    public UserdCarSearchPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedCarSearchText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement modelDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCar;

    public String getVerifyUsedCarSearchedText(){
        log.info("get the text of used Car Search text : " + usedCarSearchText.toString());
        return getTextFromElement(usedCarSearchText);
    }

    public void selectMakeFromDropDown(String make){
         log.info("select the make for car from drop down " + make);
         selectByVisibleTextFromDropDown(makeDropDown,make);
    }

    public void selectModelFromDropDown(String model){
        log.info("select the model for car from drop down " + model);
        selectByVisibleTextFromDropDown(modelDropDown,model);
    }

    public void selectLocationFromDropDown(String location){
        log.info("select the location for car from drop down " + location);
        selectByVisibleTextFromDropDown(locationDropDown,location);
    }

    public void selectPriceFromDropDown(String price){
        log.info("select the price for car from drop down " + price);
        selectByVisibleTextFromDropDown(priceDropDown,price);
    }

    public void clickOnFindMyNextCarButton(){
        log.info("click on find My Next Car button " + findMyNextCar.toString());
        clickOnElement(findMyNextCar);
    }


}
