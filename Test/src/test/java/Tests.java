import org.example.Count;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.mockito.Mockito;

public class Tests {
    private int a = 2;
    private int b = 2;
    private int c = 5;
    private int d = 0;
    @Mock
    Count count;
    @Before
    public void SetUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test_sum() {
        when(count.sum(a,b)).thenReturn(4);
        int result = count.sum(a, b);
        assertEquals(4, result);
        verify(count, times(1)).sum(a, b);
    }

    @Test
    public void test_compare() {
        when(count.compare(a,b)).thenReturn(4);
        int result = count.compare(a, b);
        assertEquals(4, result);
        verify(count, times(1)).compare(a, b);
    }
    @Test
    public void test_compare_zero() {
        when(count.compare(a,d)).thenReturn(0);
        int result = count.sum(a, d);
        assertEquals(0, result);
        verify(count, times(1)).sum(a, d);
    }

    @Test
    public void test_diff() {
        when(count.diff(a,b)).thenReturn(0);
        int result = count.diff(a, b);
        assertEquals(0, result);
        verify(count, times(1)).diff(a, b);
    }
    @Test
    public void test_diff_neg() {
        when(count.diff(a,c)).thenReturn(-3);
        int result = count.diff(a, c);
        assertEquals(-3, result);
        verify(count, times(1)).diff(a, c);
    }

    @Test
    public void test_div() {
        when(count.div(a,b)).thenReturn(1);
        int result = count.div(a, b);
        assertEquals(1, result);
        verify(count, times(1)).div(a, b);
    }
    @Test
    public void testMockedCalculateThrowsException() {
        Count mockCalculator = Mockito.mock(Count.class);
        when(mockCalculator.div(a, 0)).thenThrow(new RuntimeException("Division by zero!"));
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            mockCalculator.div(a, d);
        });
        assertEquals("Division by zero!", exception.getMessage());
    }
}