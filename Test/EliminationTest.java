import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatInputsCanBeTaken() {
        assertEquals(10, Elimination.getInput());
    }

    @Test
    void testThatInputIsValid() {
        assertTrue(Elimination.isInputValid());
    }

    @Test
    void testThatDuplicateNumbersCanBeEliminated(){
        assertFalse(Elimination.isDuplicate());
        int[] numbers = new int[5];
    }
}

