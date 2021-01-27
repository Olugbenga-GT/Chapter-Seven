import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTheSalesCommissionCanBeCalculated(){
        int [] sales = {6000, 4500, 7200, 12000, 11350, 8450, 3700, 3210, 2870, 4520, 6110, 9030, 14750, 7115, 610, 1410, 1250};
        int [] frequency = new int[9];


        SalesCommission.calculateSalaryFrequency(sales, frequency);
        assertEquals(1, frequency[0]);
        assertEquals(2, frequency[1]);
        assertEquals(2, frequency[2]);
        assertEquals(1, frequency[3]);
        assertEquals(2, frequency[4]);
        assertEquals(2, frequency[5]);
        assertEquals(2,  frequency[6]);
        assertEquals(1, frequency[7]);
        assertEquals(4, frequency[8]);
    }
}