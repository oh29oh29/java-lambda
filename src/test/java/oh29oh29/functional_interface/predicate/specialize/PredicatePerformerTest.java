package oh29oh29.functional_interface.predicate.specialize;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PredicatePerformerTest {

    @Test
    public void intPredicate() {
        // given
        final int value = 20;

        // when
        boolean result = PredicatePerformer.filter(value, (int a) -> a > 10);

        // then
        assertTrue(result);
    }

    @Test
    public void longPredicate() {
        // given
        final long value = 20L;

        // when
        boolean result = PredicatePerformer.filter(value, (long a) -> a > 10L);

        // then
        assertTrue(result);
    }

    @Test
    public void doublePredicate() {
        // given
        final double value = 20.0;

        // when
        boolean result = PredicatePerformer.filter(value, (double a) -> a > 10.0);

        // then
        assertTrue(result);
    }
}
