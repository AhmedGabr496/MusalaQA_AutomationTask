package utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonTestDataReader {
    public static JSONObject parseJson(String jsonFilePath) {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = null;
        String currentDirectory = System.getProperty("user.dir") + "/src/test/resources/";
        try {
            reader = new FileReader(currentDirectory + jsonFilePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Read the JSON File
        JSONObject obj = null;
        try {
            obj = (JSONObject) jsonParser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}

