package hei.school;

import hei.school.affirmationStatus.AffirmationStatus;
import hei.school.conjonction.CordinationConjunction;

public record Affirmation(
    AffirmationStatus affirmation1,
    CordinationConjunction conjunction,
    AffirmationStatus affirmation2
) {
}
