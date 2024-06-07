package hei.school.conjonction;

import hei.school.Affirmation;
import hei.school.affirmationStatus.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThenTest {

    @Test
    void affirmation_is_false_with_true_then_false(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var iDontKnow = new IDontKnow("Lou est généreux.");
        var then = new Then();
        var affirmation = new Affirmation(truth, then, lie);

        var result = then.calculate(affirmation);
        assertInstanceOf(Negative.class, result);
    }

    @Test
    void affirmation_is_true_with_true_then_true(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var iDontKnow = new IDontKnow("Lou est généreux.");
        var then = new Then();
        var affirmation = new Affirmation(truth, then, truth);

        var result = then.calculate(affirmation);
        assertInstanceOf(Affirmative.class, result);
    }


    @Test
    void affirmation_is_true_with_idontknow_then_false(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var iDontKnow = new IDontKnow("Lou est généreux.");
        var then = new Then();
        var affirmation = new Affirmation(lie, then, lie);

        var result = then.calculate(affirmation);
        assertInstanceOf(Affirmative.class, result);
    }

}