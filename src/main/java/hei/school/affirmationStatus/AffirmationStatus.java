package hei.school.affirmationStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public sealed class AffirmationStatus permits
        Affirmative, Negative, IDontKnow {
    protected final String affirmation;
}
