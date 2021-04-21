import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Details {

  @JsonProperty("firstName")
  public String firstName;
  @JsonProperty("lastName")
  public String lastName;
  @JsonProperty("age")
  public Integer age;

}
