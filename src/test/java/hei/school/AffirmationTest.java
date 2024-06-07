package hei.school;

import hei.school.affirmationStatus.*;
import hei.school.conjonction.And;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AffirmationTest {

    @Test
    void affirmation_is_idontknow_with_and(){
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
        var and = new And();
        var affirmation = new Affirmation(truth, and, affirmationStatus);

        var result = and.calculate(affirmation);
        assertInstanceOf(IDontKnow.class, result);
    }
}