import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class integerArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatElementsOfCountsAreSetToZer0(){
        int[] counts = new int[10];

        integerArray.setToZero(counts);
        assertEquals(0, counts[0]);
        assertEquals(0, counts[2]);
        assertEquals(0, counts[3]);
        assertEquals(0, counts[7]);
        assertEquals(0, counts[8]);
    }

    @Test
    void testThatOneCanBeAddedToEachElementOfArrayBonus(){
        int[] bonus = {5,23,65,87,21,11,89,34,23,44,67,89,22,67, 29};
        integerArray.addOne(bonus);
        assertEquals(6, bonus[0]);
        assertEquals(24, bonus[1]);
        assertEquals(90, bonus[6]);
        assertEquals(45, bonus[9]);
        assertEquals(68, bonus[13]);
    }

//    @Test
//    void testThatBestScoresCanBeDisplayedInColumn(){
//         int[] bestScores = {56, 98, 73, 90, 57};
//        integerArray.displayInColumn();
//    }
}