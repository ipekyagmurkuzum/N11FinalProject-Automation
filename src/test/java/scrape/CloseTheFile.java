package scrape;

import java.io.IOException;

import static scrape.GetCampaignURLs.urlsFile;

public class CloseTheFile {
    public static void closeFile() throws IOException {
        //close the file writer for csv
        urlsFile.close();
    }
}
