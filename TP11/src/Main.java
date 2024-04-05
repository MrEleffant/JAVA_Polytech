import fr.lelouet.TP11.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            EXO1 input = new EXO1("DSC01057.ARW");

            input.saveFis("test.ARW");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
