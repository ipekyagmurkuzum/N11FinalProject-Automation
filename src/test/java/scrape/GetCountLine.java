package scrape;

import java.io.*;

//reads csv and gets total row count

public class GetCountLine {

    public static LineNumberReader reader;
    public static int lines;

    public static void countLine() throws IOException {

        try {
            reader = new LineNumberReader(new FileReader("src/test/resources/generatedFile/campaign_urls_file.csv"));
            //read rows until you catch a blank one
            while ((reader.readLine()) != null) {
                //get current line number
                lines = reader.getLineNumber();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


