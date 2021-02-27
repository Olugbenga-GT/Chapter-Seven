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
        Elimination elimination = new Elimination();
        assertEquals(10, elimination.getInput());
    }

    @Test
    void testThatInputIsValid() {
        Elimination elimination = new Elimination();
        assertTrue(elimination.isInputValid());
    }

    @Test
    void testForAppendElements(){

        Elimination elimination = new Elimination();
        elimination.appendElements();
        assertEquals(10, elimination.getNumbers()[0]);
        assertEquals(20, elimination.getNumbers()[1]);
        assertEquals(30, elimination.getNumbers()[2]);
        assertEquals(40, elimination.getNumbers()[3]);
        assertEquals(50, elimination.getNumbers()[4]);
    }

    @Test
    void testForDuplicateNumber(){
        Elimination elimination = new Elimination();

        int [] numbers = {23, 56, 79};
        elimination.setNumbers(numbers);
        assertTrue( elimination.isNotADuplicateNumber(56));
    }
}

