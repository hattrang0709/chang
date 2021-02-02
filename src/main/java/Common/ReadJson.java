package Common;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;


public class ReadJson {

    public void getXpath() throws IOException {
        File file = new File("resources/Interface/Google.json");
        JsonFactory factory = new JsonFactory();

        JsonParser parser = factory.createParser(file);
        parser.nextToken(); // start reading the file

        while (parser.nextToken() != JsonToken.END_OBJECT) { // loop until "}"
            String name = parser.getCurrentName();

            if (name.equals("Interfaces")) {
                parser.nextToken();
                System.out.println(parser.getText());
            } else if (name.equals("SearchPage")) {
                parser.nextToken();
                System.out.println(parser.getText());
            } else if (name.equals("name")) {
                parser.nextToken();
                System.out.println(parser.getIntValue());
            } else if (name.equals("elements")) {
                parser.nextToken();
                while (parser.nextToken() != JsonToken.END_ARRAY) {
                    System.out.println(parser.getText());
                }
            }
        }

        parser.close();
    }

}
