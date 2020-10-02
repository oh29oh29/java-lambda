package oh29oh29.functional_interface.function.specialize;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionPerformerTest {

    @Test
    public void intFunction() {
        // given
        final int value = 10;

        // when
        final String result = FunctionPerformer.map(value, (int a) -> "value:" + a);

        // then
        assertEquals("value:10", result);
    }

    @Test
    public void intToDoubleFunction() {
        // given
        final int value = 10;

        // when
        final double result = FunctionPerformer.map(value, (int a) -> a + 10.0);

        // then
        assertEquals(20.0, result, 0);
    }

    @Test
    public void intToLongFunction() {
        // given
        final int value = 10;

        // when
        final long result = FunctionPerformer.map(value, (int a) -> a + 10L);

        // then
        assertEquals(20L, result);
    }

    @Test
    public void longFunction() {
        // given
        final long value = 10L;

        // when
        final String result = FunctionPerformer.map(value, (long a) -> "value:" + a);

        // then
        assertEquals("value:10", result);
    }

    @Test
    public void longToDoubleFunction() {
        // given
        final long value = 10L;

        // when
        final double result = FunctionPerformer.map(value, (long a) -> a + 10.0);

        // then
        assertEquals(20.0, result, 0);
    }

    @Test
    public void longToIntFunction() {
        // given
        final long value = 10L;

        // when
        final int result = FunctionPerformer.map(value, (long a) -> (int) a + 10);

        // then
        assertEquals(20, result);
    }

    @Test
    public void doubleFunction() {
        // given
        final double value = 10.0;

        // when
        final String result = FunctionPerformer.map(value, (double a) -> "value:" + a);

        // then
        assertEquals("value:10.0", result);
    }

    @Test
    public void doubleToIntFunction() {
        // given
        final double value = 10.0;

        // when
        final int result = FunctionPerformer.map(value, (double a) -> (int) a + 10);

        // then
        assertEquals(20, result);
    }

    @Test
    public void doubleToLongFunction() {
        // given
        final double value = 10.0;

        // when
        final long result = FunctionPerformer.map(value, (double a) -> (long) a + 10L);

        // then
        assertEquals(20L, result);
    }

    @Test
    public void toIntFunction() {
        // given
        final String value = "10";

        // when
        final int result = FunctionPerformer.map(value, (String a) -> Integer.parseInt(a) + 10);

        // then
        assertEquals(20, result);
    }

    @Test
    public void toDoubleFunction() {
        // given
        final String value = "10";

        // when
        final double result = FunctionPerformer.map(value, (String a) -> Double.parseDouble(a) + 10.0);

        // then
        assertEquals(20.0, result, 0);
    }

    @Test
    public void toLongFunction() {
        // given
        final String value = "10";

        // when
        final long result = FunctionPerformer.map(value, (String a) -> Long.parseLong(a) + 10L);

        // then
        assertEquals(20L, result);
    }
}
