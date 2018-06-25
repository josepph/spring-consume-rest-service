package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Value {

    private Long id;
    private String quote;

    public Value() {};

    public String toString() {
        return "Value{" +
                "id='" + id+ '\'' +
                ", quote=" + quote +
                '}';
    }


}
