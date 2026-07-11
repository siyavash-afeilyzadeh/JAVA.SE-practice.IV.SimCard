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
    private LocalDate purchaseDate;

    private double price;

    @Override
    public String toString() {
        return "\nDocument " + id +
                " Info| Name/Family: " + person.getName() + person.getFamily() +
                " |SimCard inf: " + getSimCard() +
                " |Purchase Date: " + getPurchaseDate() +
                " |Price: " + getPrice();
    }
}
