package hei.school.conjonction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public sealed abstract class Conjunction permits
    And, Or, Then {
    protected final String conjunction;
}
