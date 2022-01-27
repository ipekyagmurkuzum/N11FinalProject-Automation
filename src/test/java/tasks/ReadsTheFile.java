package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import org.junit.Assert;
import scrape.GetCountLine;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static scrape.GetCampaignURLs.rowNumber;
import static scrape.GetCountLine.lines;


//implementation of countLine method as a task,
//so that in can be performed by the actor
public class ReadsTheFile implements Performable {

    public static ReadsTheFile checksRowCount() {
        return instrumented(ReadsTheFile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            GetCountLine.countLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Row number check",rowNumber,lines-1);
    }
}
