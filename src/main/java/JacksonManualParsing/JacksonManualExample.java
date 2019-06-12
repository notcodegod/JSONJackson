package JacksonManualParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonManualExample {
    private JsonNode rootJson;

    public JacksonManualExample(String fileName){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            rootJson = objectMapper.readTree(new File(fileName));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public boolean getSuccess(){return rootJson.get("success").asBoolean();}
}
