package n11Pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.n11.com/kampanyalar")
public class N11CampaignsPage extends PageObject{


    public static Target FASHION_BUTTON = Target.the("//*[@data-category=\"giyimAyakkabi\"]")
            .located(By.xpath("//*[@data-category=\"giyimAyakkabi\"]"));
    public static Target ELECTRONICS_BUTTON = Target.the("//*[@data-category=\"elektronik\"]")
            .located(By.xpath("//*[@data-category=\"elektronik\"]"));
    public static Target HOMEANDLIVING_BUTTON = Target.the("//*[@data-category=\"evYasam\"]")
            .located(By.xpath("//*[@data-category=\"evYasam\"]"));
    public static Target BABYCARE_BUTTON = Target.the("//*[@data-category=\"anneBebek\"]")
            .located(By.xpath("//*[@data-category=\"anneBebek\"]"));
    public static Target COSMETICS_BUTTON = Target.the("//*[@data-category=\"kozmetikKisiselBakim\"]")
            .located(By.xpath("//*[@data-category=\"kozmetikKisiselBakim\"]"));
    public static Target JEWELERY_BUTTON = Target.the("//*[@data-category=\"mucevherSaat\"]")
            .located(By.xpath("//*[@data-category=\"mucevherSaat\"]"));
    public static Target SPORTS_BUTTON = Target.the("//*[@data-category=\"spor\"]")
            .located(By.xpath("//*[@data-category=\"spor\"]"));
    public static Target MUSICADNBOOKS_BUTTON = Target.the("//*[@data-category=\"kitapOyun\"]")
            .located(By.xpath("//*[@data-category=\"kitapOyun\"]"));
    public static Target OTOMATIVE_BUTTON = Target.the("//*[@data-category=\"otomobil\"]")
            .located(By.xpath("//*[@data-category=\"otomobil\"]"));

    public static Target URL = Target.the("url")
            .located(By.xpath("//*[@class = \"imgBoxInsetShadow medium\"]//a[text()]"));

}