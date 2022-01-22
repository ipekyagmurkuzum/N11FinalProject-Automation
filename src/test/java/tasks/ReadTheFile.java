package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.ensure.Ensure;
import scrape.GetCountLine;

import java.io.File;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static scrape.GetCountLine.lines;

public class ReadTheFile implements Performable {

    public static ReadTheFile readTheFile() {
        return instrumented(ReadTheFile.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            GetCountLine.countLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
