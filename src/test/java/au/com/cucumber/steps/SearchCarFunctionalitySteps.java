package au.com.cucumber.steps;

import au.com.carsguide.websitepages.CarSearchPage;
import au.com.carsguide.websitepages.HomePage;
import au.com.carsguide.websitepages.SearchResultPage;
import au.com.carsguide.websitepages.UserdCarSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchCarFunctionalitySteps {
    @Given("^I click on Url https://www\\.carsguide\\.com\\.au/$")
    public void iClickOnUrlHttpsWwwCarsguideComAu() {
    }

    @Then("^I successfully on homepage of carsguide website$")
    public void iSuccessfullyOnHomepageOfCarsguideWebsite() {
    }

    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new HomePage().mouseHoverOnBuySellTab();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarLink();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals("search page text is not match","new and used car search",new CarSearchPage().getVerifyNewCarSearchText());
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new CarSearchPage().selectMakeFromDropDown(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new CarSearchPage().selectModelFromDropDown(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new CarSearchPage().selectLocationFromDropDown(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new CarSearchPage().selectPriceFromDropDown(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new CarSearchPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        String actualMessageText = new SearchResultPage().getVerifyNewCarSearchText();
        Assert.assertTrue(actualMessageText.contains(make));
    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals("Used Cars For Sale is not match","Used Cars For Sale",new UserdCarSearchPage().getVerifyUsedCarSearchedText());
    }

    @Then("^I should see the make used cars \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeUsedCarsInResults(String make) {
        String actualMessageText = new SearchResultPage().getVerifyNewCarSearchText();
        Assert.assertTrue(actualMessageText.contains(make));

    }
}
