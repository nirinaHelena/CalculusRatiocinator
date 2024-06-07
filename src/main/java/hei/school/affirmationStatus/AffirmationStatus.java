package hei.school.affirmationStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public sealed abstract class AffirmationStatus permits
        False, IDontKnow, True, Lie, Truth {
    protected final String affirmation;
}
