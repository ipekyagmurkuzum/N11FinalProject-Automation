package scrape;

import java.io.*;

public class GetCountLine {

    public static int lines;
    public static LineNumberReader reader;
    public static File file = new File("src/test/resources/campaign_urls_file.csv");

    public static int countLines() throws IOException {

        reader = new LineNumberReader(new FileReader(file));
        lines = reader.getLineNumber();
        reader.close();
        return lines;
    }
}

