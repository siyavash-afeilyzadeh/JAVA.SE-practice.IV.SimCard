package black.entity;

import black.utils.Operator;
import black.utils.Status;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class SimCard {
    private int id;
    private String number;
    private Operator operator;

    @Builder.Default
    private Status status = Status.NotActive;
}
