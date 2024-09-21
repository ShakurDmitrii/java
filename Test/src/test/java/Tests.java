import org.example.Count;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.example.Count.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Tests {
    private int a = 2;
    private int b = 2;
    private int c = 5;
    private int d = 0;
    private int method;
    private int method_compare;
    private int method_compare_zero;
    private int method_diff;
    private int method_test_diff_neg;
    private int method_div;

    @Before
    public void SetUp(){
        method = sum(a, b);
        method_compare = compare(a,b);
        method_compare_zero = compare(a, d);
        method_diff = diff(a,b);
        method_test_diff_neg = diff(a,c);
        method_div = div(a,b);


    }
    @After

    @Test
    public void test_sum() {
        int result = method;
        assertEquals(4, result);
    }
    @Test
    public void test_compare() {
        int result = method_compare;
        assertEquals(4, result);
    }
    @Test
    public void test_compare_zero() {
        int result_null = method_compare_zero;
        assertEquals(0, result_null);
    }

    @Test
    public void test_diff() {
        int result = method_diff;
        assertEquals(result, 0);
    }
    @Test
    public void test_diff_neg() {
        int result_negative = method_test_diff_neg;
        assertEquals(result_negative, -3);
    }

    @Test
    public void test_div() {
        int result = method_div;
        assertEquals(result, 1);
    }
    @Test
    public void test_div_exception(){
        assertThrows(RuntimeException.class, () -> Count.div(a,d));

    }
}