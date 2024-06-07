package hei.school.conjonction;

import hei.school.Affirmation;
import hei.school.affirmationStatus.*;

public non-sealed class Then extends Conjunction implements CordinationConjunction{
    private static final String conjunction = "then";
    public Then() {
        super(conjunction);
    }

    @Override
    public AffirmationStatus calculate(Affirmation affirmation) {
        AffirmationStatus affirmationStatus = new AffirmationStatus(
                affirmation.affirmation1().getAffirmation() +
                        affirmation.conjunction().getConjunction() +
                        affirmation.affirmation2().getAffirmation());

        Affirmative truth = new Affirmative(affirmationStatus.getAffirmation());
        Negative lie = new Lie(affirmationStatus.getAffirmation());
        IDontKnow iDontKnow = new IDontKnow(affirmationStatus.getAffirmation());

        boolean a = affirmation.affirmation1() instanceof Affirmative;
        boolean b = affirmation.affirmation2() instanceof Affirmative;
        boolean c = affirmation.affirmation1() instanceof IDontKnow;
        boolean d = affirmation.affirmation2() instanceof IDontKnow;

        return (a == true && b == false)? lie : truth;
    }
}
