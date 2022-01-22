package scrape;

import java.io.*;

public class GetCountLine {
    public static LineNumberReader reader;
    public static int lines;

    public static void countLine() throws IOException {

        try {
            reader = new LineNumberReader(new FileReader("src/test/resources/campaign_urls_file.csv"));
            while ((reader.readLine()) != null) {
                lines = reader.getLineNumber();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


