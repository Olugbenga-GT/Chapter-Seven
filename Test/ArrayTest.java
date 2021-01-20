import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTheArrayElementsCanBeSummed() {
        int [] gbengaArray = {5,6,7,8,9};
        Array myArray = new Array(gbengaArray);
        assertEquals(35, myArray.calculateArrayTotal());
    }

    @Test
    void testThatWeCanGetTheAverageOfTheArrayElement(){
        int [] testArray = {5,6,7,8,9};
        Array myArray = new Array(testArray);
        assertEquals(7, myArray.getArrayAverage());
    }

    @Test
    void testToGetTheMinimumElementOfTheArray() {
        int[] testArray = {5, 6, 7, 8, 43, 1, 2, 9};
        Array myArray = new Array(testArray);
        assertEquals(1, myArray.getArrayMinimum());
    }

    @Test
    void testToGetTheMaximumElementOfTheArray(){
        int [] testArray = {5,6,7,8,43,105,2,9};
        Array myArray = new Array(testArray);
        assertEquals(105, myArray.getArrayMaximum());
    }

    @Test
    void testToGetTheMinimumPossibleSumOfTheArrayElements(){
        int [] testArray = {5,6,7,8,4,2,9};
        Array myArray = new Array(testArray);
        assertEquals(32 , myArray.getArrayMinimumSum());

    }

    @Test
    void testToGetTheMaximumPossibleSumOfTheArrayElements(){
        int [] testArray = {5,6,7,8,4,2,9};
        Array myArray = new Array(testArray);
        assertEquals(39, myArray.getArrayMaximumSum());

    }

}