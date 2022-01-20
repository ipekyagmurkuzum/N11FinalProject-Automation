package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.GetCampaignURL;
import tasks.NavigetoTo;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static n11Pages.N11CampaignsPage.*;


public class GetCampaignURLSteps {

    public static List<Object> categories = Arrays.asList(FASHION_BUTTON, ELECTRONICS_BUTTON, HOMEANDLIVING_BUTTON,
            BABYCARE_BUTTON, COSMETICS_BUTTON, JEWELERY_BUTTON, SPORTS_BUTTON,
            MUSICADNBOOKS_BUTTON, OTOMATIVE_BUTTON);

    public static String currentUrl;

    @Managed
    public static WebDriver driver;
    Actor actor = new Actor("she");

    @Given("actor is on the campaigns page on N11")
    public void iAmOnTheMainPage() {
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(NavigetoTo.n11CampaignsPage());
    }

    @When("actor gets every campaign's url under every category")
    public void selectACategory() throws IOException {
        categories.forEach(
                categoryName -> actor.attemptsTo(
                        Click.on(categoryName.toString())));
    }

    @And("actor writes url data with category name to a csv file")
    public void writeToCSV() throws IOException {
        currentUrl = driver.getCurrentUrl();
        GetCampaignURL.andWriteToExcel(currentUrl);
    }
}


