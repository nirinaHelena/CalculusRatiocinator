package hei.school;

import hei.school.affirmationStatus.AffirmationStatus;
import hei.school.conjonction.Conjunction;
import hei.school.conjonction.CordinationConjunction;

public record Affirmation(
    AffirmationStatus affirmation1,
    Conjunction conjunction,
    AffirmationStatus affirmation2
) {
}
