import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonWriter {

    public static void main(String[] args) {

        Country countryObj = new Country();
        countryObj.name = "India";
        countryObj.population = 1000000;

        List<String> listOfStates = new ArrayList<>();
        listOfStates.add("Madhya Pradesh");
        listOfStates.add("Maharastra");
        listOfStates.add("Rajasthan");

        countryObj.states = listOfStates ;
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("/Users/rahul.joshi/JsonProject/src/example.json"), countryObj );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}