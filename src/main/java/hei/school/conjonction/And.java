package hei.school.conjonction;

import hei.school.Affirmation;
import hei.school.affirmationStatus.*;

public final class And extends Conjunction implements CordinationConjunction {
    private static final String conjunction = "and";
    public And() {
        super(conjunction);
    }

    @Override
    public AffirmationStatus calculate(Affirmation affirmation) {
        boolean a = affirmation.affirmation1() instanceof Affirmative;
        boolean b = affirmation.affirmation2() instanceof Affirmative;
        boolean c = affirmation.affirmation1() instanceof IDontKnow;
        boolean d = affirmation.affirmation2() instanceof IDontKnow;

        Affirmative truth = new Affirmative(
                affirmation.affirmation1().getAffirmation() +
                affirmation.conjunction().getConjunction() +
                affirmation.affirmation2().getAffirmation());
        Negative lie = new Lie(
                affirmation.affirmation1().getAffirmation() +
                affirmation.conjunction().getConjunction() +
                affirmation.affirmation2().getAffirmation());
        IDontKnow iDontKnow = new IDontKnow(
                affirmation.affirmation1().getAffirmation() +
                        affirmation.conjunction().getConjunction() +
                        affirmation.affirmation2().getAffirmation());
        return (a == b) ? truth : (c || d) ? iDontKnow : lie;
    }
}
