package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import scrape.GetCampaignURLs;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetEveryCampaignsURL implements Performable {

    public static GetEveryCampaignsURL andWriteItToACSVFile() {
        return instrumented(GetEveryCampaignsURL.class);
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