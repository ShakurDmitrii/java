import org.example.Sum;
import org.junit.Test;
import static org.example.Sum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class Tests {

    @Test
    public void test_sum() {
        int result = sum(2, 2);
        assertEquals(4, result);
    }
    @Test
    public void test_compare() {
        int result = compare(2, 2);
        assertEquals(4, result);
    }
    @Test
    public void test_compare_zero() {
        int result_null = compare(2, 0);
        assertEquals(0, result_null);
    }

    @Test
    public void test_diff() {
        int result = diff(2, 2);
        assertEquals(result, 0);
    }
    @Test
    public void test_diff_neg() {
        int result_negative = diff(2, 5);
        assertEquals(result_negative, -3);
    }

    @Test
    public void test_div() {
        int result = div(2, 2);
        assertEquals(result, 1);
    }
    @Test
    public void test_div_exception(){
        assertThrows(RuntimeException.class, () -> Sum.div(1,0));

    }
}