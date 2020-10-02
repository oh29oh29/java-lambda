package oh29oh29.functional_interface.supplier.specialize;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SupplierPerformerTest {

    @Test
    public void booleanSupplier() {
        // when
        final boolean result = SupplierPerformer.get(() -> true);

        // then
        assertTrue(result);
    }

    @Test
    public void intSupplier() {
        // when
        final int result = SupplierPerformer.get(() -> 10);

        // then
        assertEquals(10, result);
    }

    @Test
    public void longSupplier() {
        // when
        final long result = SupplierPerformer.get(() -> 10L);

        // then
        assertEquals(10L, result);
    }

    @Test
    public void doubleSupplier() {
        // when
        final double result = SupplierPerformer.get(() -> 10.0);

        // then
        assertEquals(10.0, result, 0);
    }
}
