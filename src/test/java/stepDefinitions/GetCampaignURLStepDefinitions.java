package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;
import java.util.Arrays;
import java.util.List;

import static n11Pages.N11CampaignsPage.*;

public class GetCampaignURLStepDefinitions {

    public static List<Target> categories = Arrays.asList(FASHION_BUTTON, ELECTRONICS_BUTTON, HOMEANDLIVING_BUTTON,
            BABYCARE_BUTTON, COSMETICS_BUTTON, JEWELERY_BUTTON, SPORTS_BUTTON,
            MUSICADNBOOKS_BUTTON, OTOMATIVE_BUTTON);

    @Managed
    public static WebDriver driver;
    Actor actor = new Actor("She");

    @Given("actor is on the campaigns page on N11")
    public void isOnTheMainPage() {
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(Navigate.toN11CampaignsPage());
    }

    @When("actor gets every campaign's urls within every category and writes them to a new cvs file")
    public void getCampaignUrlsFromCategories() {
        categories.forEach(
                categoryName -> {
                    actor.attemptsTo(
                            Click.on(categoryName),
                            GetsEveryCampaignsURL.andWritesItToACSVFile());
                });
    }

    @And("closes the file")
    public void closesTheFile() {
        actor.attemptsTo(
                ClosesTheFile.theCSVFile());
    }


    @Then("file should be read and row number should be checked")
    public void rowNumberShouldBeChecked() {
        actor.attemptsTo(
                ReadsTheFile.checksRowCount());
    }
}


