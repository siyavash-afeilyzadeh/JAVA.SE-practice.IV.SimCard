package black.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@SuperBuilder
public class Person {
    private int id;
    private String name;
    private String family;
    private int age;

    @Builder.Default
    private List<Document> documents = new ArrayList<>();
}
