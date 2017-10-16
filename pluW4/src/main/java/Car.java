/**
 * Created by plu on 16/10/2017.
 */
import lombok.Data;
import lombok.experimental.Builder;

@Data
@Builder
public class Car {
    String carId;
    String carName;
    String creator;
}
