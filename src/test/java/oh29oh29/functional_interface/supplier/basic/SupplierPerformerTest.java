package oh29oh29.functional_interface.supplier.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SupplierPerformerTest {

    @Test
    public void get() {
        // when
        final String result = SupplierPerformer.get(() -> "Supplier Test");

        // then
        assertEquals("Supplier Test", result);
    }
}
