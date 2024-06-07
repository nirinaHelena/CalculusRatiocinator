package hei.school;

import hei.school.affirmationStatus.AffirmationStatus;
import hei.school.affirmationStatus.IDontKnow;
import hei.school.affirmationStatus.Lie;
import hei.school.affirmationStatus.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AffirmationTest {

    @BeforeEach
    void setUp() {
        var truth = new Truth("Lou est beau.");
        var lie = new Lie("Lou est pauvre.");
        var affirmationStatus = new IDontKnow("Lou est généreux.");
    }
}