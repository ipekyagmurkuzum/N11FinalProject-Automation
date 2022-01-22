package n11Pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.n11.com/kampanyalar")
public class N11CampaignsPage extends PageObject{

    public static Target FASHION_BUTTON = Target.the("giyimAyakkabi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Moda')]"));
    public static Target ELECTRONICS_BUTTON = Target.the("elektronik")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Elektronik')]"));
    public static Target HOMEANDLIVING_BUTTON = Target.the("evYasam")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Ev & Yaşam')]"));
    public static Target BABYCARE_BUTTON = Target.the("anneBebek")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Anne & Bebek')]"));
    public static Target COSMETICS_BUTTON = Target.the("kozmetikKisiselBakim")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Kozmetik & Kişisel Bakım')]"));
    public static Target JEWELERY_BUTTON = Target.the("mucevherSaat")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Mücevher & Saat')]"));
    public static Target SPORTS_BUTTON = Target.the("spor")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Spor & Outdoor')]"));
    public static Target MUSICADNBOOKS_BUTTON = Target.the("kitapOyun")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Kitap, Müzik, Film, Oyun')]"));
    public static Target OTOMATIVE_BUTTON = Target.the("otomobil")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Otomotiv & Motosiklet')]"));

}