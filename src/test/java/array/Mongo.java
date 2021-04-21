package array;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Mongo {

  public static void main(String[] args) throws JsonProcessingException, ParseException {
    fetchPaytmfee();
  }

  public static void fetchPaytmfee() throws JsonProcessingException, ParseException {
    String s = "{ \"domestic\" : { \"airasia\" : { \"I5\" : { \"adult\" : 299.0 , \"child\" : 299.0 , \"infant\" : 0} , \"default\" : { \"adult\" : 299 , \"child\" : 299 , \"infant\" : 0}} , \"tpgds\" : { \"AI\" : { \"adult\" : 299 , \"child\" : 299 , \"infant\" : 0} , \"default\" : { \"adult\" : 0 , \"child\" : 0 , \"infant\" : 0}} , \"paytm\" : { \"UK\" : { \"adult\" : 299 , \"child\" : 299 , \"infant\" : 0} , \"default\" : { \"adult\" : 0 , \"child\" : 0 , \"infant\" : 0}} , \"default\" : { \"adult\" : 299.0 , \"child\" : 299.0 , \"infant\" : 0}}}";
    s = s.replaceAll("\n", "");
    System.out.println(s);
    JSONParser parser = new JSONParser();
    JSONObject json = (JSONObject) parser.parse(s);
    Map<String, Map<String, Map<String, Map<String, String>>>> mapMap = new HashMap<String, Map<String, Map<String, Map<String, String>>>>();
    mapMap.put("domestic", (Map<String, Map<String, Map<String, String>>>) json.get("domestic"));
    String s1 = String.valueOf(mapMap.get("domestic").get("airasia").get("I5").get("adult"));

  }
}
