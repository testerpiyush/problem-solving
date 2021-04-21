import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiTest {

 /* String s = "{\n"
      + "  \"accounting\": [\n"
      + "    {\n"
      + "      \"firstName\": \"John\",\n"
      + "      \"lastName\": \"Doe\",\n"
      + "      \"age\": 23\n"
      + "    },\n"
      + "    {\n"
      + "      \"firstName\": \"Mary\",\n"
      + "      \"lastName\": \"Smith\",\n"
      + "      \"age\": 32\n"
      + "    }\n"
      + "  ],\n"
      + "  \"sales\": [\n"
      + "    {\n"
      + "      \"firstName\": \"Sally\",\n"
      + "      \"lastName\": \"Green\",\n"
      + "      \"age\": 27\n"
      + "    },\n"
      + "    {\n"
      + "      \"firstName\": \"Jim\",\n"
      + "      \"lastName\": \"Galley\",\n"
      + "      \"age\": 41\n"
      + "    }\n"
      + "  ]\n"
      + "}";

  public void findAge() throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();

    ResponseClass responseClass = mapper.readValue(s, ResponseClass.class);

    Map<Integer, Details> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    for(Details details :responseClass.accounting ){

      map.put(details.getAge(), details);
      list.add(details.age);

    }







  }*/

}
