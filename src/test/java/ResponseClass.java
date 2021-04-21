import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseClass {

  @JsonProperty("accounting")
  public List<Details> accounting = null;
  @JsonProperty("sales")
  public List<Details> sales = null;
}


