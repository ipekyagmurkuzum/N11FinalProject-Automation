package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import scrape.GetCampaignURLs;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//implementation of getUrlAndWriteToExcel method as a task,
//so that in can be performed by the actor
public class GetsEveryCampaignsURL implements Performable {

    public static GetsEveryCampaignsURL andWritesItToACSVFile() {
        return instrumented(GetsEveryCampaignsURL.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            GetCampaignURLs.getUrlAndWriteToExcel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
