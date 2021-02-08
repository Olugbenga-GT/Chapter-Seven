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
    void testThatElementsCanBeAddedToNumbers(){
        int[] numbers = new int[5];
        Elimination elimination = new Elimination();
        elimination.appendElements(numbers);
        assertEquals(10, numbers[0]);
        assertEquals(20, numbers[1]);
        assertEquals(30, numbers[2]);
        assertEquals(40, numbers[3]);
        assertEquals(50, numbers[4]);
//
    }

//    @Test
//    void testThatThereAreNoDuplicateNumber(){
//        Elimination elimination = new Elimination();
//        int[] numbers = new int[5];
//     assertTrue( Elimination.isDuplicateNumberPresent(numbers));
//    }
}

