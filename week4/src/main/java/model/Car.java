package model;
import lombok.Data;
import lombok.experimental.Builder;

@Data
@Builder
public class Car {
    String carId;
    String carName;
    String creator;
}
