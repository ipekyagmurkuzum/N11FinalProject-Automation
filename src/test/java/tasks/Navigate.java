package tasks;

import n11Pages.N11CampaignsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


//implementation of navigation of user as a performable method
public class Navigate {
    public static Performable toN11CampaignsPage() {
        return Task.where("{0} opens the n11 home page",
                Open.browserOn().the(N11CampaignsPage.class));
    }
}
