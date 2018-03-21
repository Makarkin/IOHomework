package readMethods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadClass {

    private static String readLongString(BufferedReader buffIn) throws IOException {
        StringBuilder everything = new StringBuilder();
        String line;
        while( (line = buffIn.readLine()) != null) {
            everything.append(line);
        }
        return everything.toString();
    }

    public static void fileToString(String fileDirectory, String fileString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileDirectory))) {
             fileString = readLongString(reader);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
