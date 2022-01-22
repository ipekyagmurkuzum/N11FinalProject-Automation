package scrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

import static stepDefinitions.GetCampaignURLStepDefinitions.driver;

public class GetCampaignURLs {


    public static FileWriter urlsFile;
    public static int rowNumber;

    static {
        try {
            urlsFile = new FileWriter("src/test/resources/generatedFile/campaign_urls_file.csv");
            urlsFile.write("Category, URLs\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getUrlAndWriteToExcel() throws IOException {

        Document document;

        String currentUrl = driver.getCurrentUrl();
        document = Jsoup.connect(currentUrl).get();

        try {
            switch (currentUrl) {
                case "https://www.n11.com/kampanyalar#giyim-ayakkabi":
                    Elements links = document.select("section.group.category-11 a[href]");
                    for (Element link : links) {
                        urlsFile.write("Moda," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#elektronik":
                    Elements links2 = document.select("section.group.category-12 a[href]");
                    for (Element link : links2) {
                        urlsFile.write("Elektronik," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#ev-yasam":
                    Elements links3 = document.select("section.group.category-13 a[href]");
                    for (Element link : links3) {
                        urlsFile.write("Ev & Yaşam," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#anne-bebek":
                    Elements links4 = document.select("section.group.category-14 a[href]");
                    for (Element link : links4) {
                        urlsFile.write("Anne & Bebek," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#kozmetik-kisisel-bakim":
                    Elements links5 = document.select("section.group.category-15 a[href]");
                    for (Element link : links5) {
                        urlsFile.write("Kozmetik & Kişisel Bakım," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#mucevher-saat":
                    Elements links6 = document.select("section.group.category-16 a[href]");
                    for (Element link : links6) {
                        urlsFile.write("Mücevher & Saat," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#spor-outdoor":
                    Elements links7 = document.select("section.group.category-17 a[href]");
                    for (Element link : links7) {
                        urlsFile.write("Spor & Outdoor," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#kitap-muzik-film-oyun":
                    Elements links8 = document.select("section.group.category-18 a[href]");
                    for (Element link : links8) {
                        urlsFile.write("Kitap & Müzik & Film & Oyun," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;

                case "https://www.n11.com/kampanyalar#otomotiv-motosiklet":
                    Elements links9 = document.select("section.group.category-110 a[href]");
                    for (Element link : links9) {
                        urlsFile.write("Otomotiv & Motosiklet," + link.attr("href") + "\n");
                        rowNumber += 1 ;
                    }
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

