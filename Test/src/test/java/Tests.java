import org.example.Sum;
import org.junit.After;
import org.junit.Test;
import static org.example.Sum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import  org.mockito.Mockito;
public class Tests {
    private int a = 2;
    private int b = 2;
    private int c = 5;
    private int d = 0;

    @After
    public void test_sum() {
        int result = sum(a, b);
        assertEquals(4, result);
    }
    @Test
    public void test_compare() {
        int result = compare(a, b);
        assertEquals(4, result);
    }
    @Test
    public void test_compare_zero() {
        int result_null = compare(a, d);
        assertEquals(0, result_null);
    }

    @Test
    public void test_diff() {
        int result = diff(a, b);
        assertEquals(result, 0);
    }
    @Test
    public void test_diff_neg() {
        int result_negative = diff(a, c);
        assertEquals(result_negative, -3);
    }

    @Test
    public void test_div() {
        int result = div(a, b);
        assertEquals(result, 1);
    }
    @Test
    public void test_div_exception(){
        assertThrows(RuntimeException.class, () -> Sum.div(a,d));

    }
}