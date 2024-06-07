package hei.school.conjonction;

import hei.school.Affirmation;
import hei.school.affirmationStatus.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrTest{

    @Test
    void affirmation_is_true_with_true_or_idontknow(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var iDontKnow = new IDontKnow("Lou est généreux.");
        var or = new Or();
        var affirmation = new Affirmation(truth, or, iDontKnow);

        var result = or.calculate(affirmation);
        assertInstanceOf(Affirmative.class, result);
    }

    @Test
    void affirmation_is_true_with_idontknow_or_true(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var iDontKnow = new IDontKnow("Lou est généreux.");
        var or = new Or();
        var affirmation = new Affirmation(iDontKnow, or, truth);

        var result = or.calculate(affirmation);
        assertInstanceOf(Affirmative.class, result);
    }

    @Test
    void affirmation_is_true_with_false_or_true(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
        var or = new Or();
        var affirmation = new Affirmation(lie, or, truth);

        var result = or.calculate(affirmation);
        assertInstanceOf(Affirmative.class, result);
    }

    @Test
    void affirmation_is_true_with_true_or_false(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
        var or = new Or();
        var affirmation = new Affirmation(truth, or, lie);

        var result = or.calculate(affirmation);
        assertInstanceOf(Affirmative.class, result);
    }

    @Test
    void affirmation_is_false_with_false_or_false(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
        var or = new Or();
        var affirmation = new Affirmation(lie, or, lie);

        var result = or.calculate(affirmation);
        assertInstanceOf(Negative.class, result);
    }
}