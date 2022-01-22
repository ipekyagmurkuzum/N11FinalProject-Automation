package scrape;

import java.io.IOException;

import static scrape.GetCampaignURLs.urlsFile;

public class CloseTheFile {
    public static void closeFile() throws IOException {
        urlsFile.close();
    }
}
