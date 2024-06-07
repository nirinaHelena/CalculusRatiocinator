package hei.school;

import hei.school.affirmationStatus.*;
import hei.school.conjonction.And;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndTest {

    @Test
    void affirmation_is_idontknow_with_true_and_idontknow(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var iDontKnow = new IDontKnow("Lou est généreux.");
        var and = new And();
        var affirmation = new Affirmation(truth, and, iDontKnow);

        var result = and.calculate(affirmation);
        assertInstanceOf(IDontKnow.class, result);
    }

    @Test
    void affirmation_is_true_with_true_and_true(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
        var and = new And();
        var affirmation = new Affirmation(truth, and, truth);

        var result = and.calculate(affirmation);
        assertInstanceOf(Affirmative.class, result);
    }

    @Test
    void affirmation_is_false_with_false_and_true(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
        var and = new And();
        var affirmation = new Affirmation(lie, and, truth);

        var result = and.calculate(affirmation);
        assertInstanceOf(Negative.class, result);
    }

    @Test
    void affirmation_is_false_with_false_and_false(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
        var and = new And();
        var affirmation = new Affirmation(lie, and, lie);

        var result = and.calculate(affirmation);
        assertInstanceOf(Negative.class, result);
    }

}