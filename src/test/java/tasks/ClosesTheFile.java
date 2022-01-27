package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import scrape.CloseTheFile;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//implementation of closeTheFile method as a task,
//so that in can be performed by the actor
public class ClosesTheFile implements Task {

    public static ClosesTheFile theCSVFile() {
        return instrumented(ClosesTheFile.class);
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

