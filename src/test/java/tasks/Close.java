package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import scrape.CloseTheFile;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Close implements Task {

    public static Close theCSVFile() {
        return instrumented(Close.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            CloseTheFile.closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

