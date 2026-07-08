package black.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@SuperBuilder
public class Document {
    private int id;
    private Person person;
    private SimCard simCard;

    @Builder.Default
    private LocalDate purchaseDate = LocalDate.now();

    private double price;
}
