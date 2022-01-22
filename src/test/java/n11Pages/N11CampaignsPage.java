package n11Pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.n11.com/kampanyalar")
public class N11CampaignsPage extends PageObject{

    public static Target FASHION_BUTTON = Target.the("Moda Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Moda')]"));
    public static Target ELECTRONICS_BUTTON = Target.the("Elektronik Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Elektronik')]"));
    public static Target HOMEANDLIVING_BUTTON = Target.the("Ev & Yaşam Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Ev & Yaşam')]"));
    public static Target BABYCARE_BUTTON = Target.the("Anne & Bebek Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Anne & Bebek')]"));
    public static Target COSMETICS_BUTTON = Target.the("Kozmetik & Kisisel Bakim Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Kozmetik & Kişisel Bakım')]"));
    public static Target JEWELERY_BUTTON = Target.the("Mücevher & Saat Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Mücevher & Saat')]"));
    public static Target SPORTS_BUTTON = Target.the("Spor & Outdoor Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Spor & Outdoor')]"));
    public static Target MUSICADNBOOKS_BUTTON = Target.the("Kitap, Müzik, Film, Oyun Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Kitap, Müzik, Film, Oyun')]"));
    public static Target OTOMATIVE_BUTTON = Target.the("Otomotiv & Motosiklet Kategorisi")
            .located(By.xpath("//*[@class=\"title\"][contains(text(), 'Otomotiv & Motosiklet')]"));

}