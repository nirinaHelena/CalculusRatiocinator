package hei.school;

import hei.school.affirmationStatus.AffirmationStatus;

public record Affirmation(
    AffirmationStatus affirmation1,
    CordinationConjunction conjunction,
    AffirmationStatus affirmation2
) {

}
