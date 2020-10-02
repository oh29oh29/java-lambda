package oh29oh29.functional_interface.supplier.specialize;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class SupplierPerformer {

    public static boolean get(BooleanSupplier s) {
        return s.getAsBoolean();
    }

    public static int get(IntSupplier s) {
        return s.getAsInt();
    }

    public static long get(LongSupplier s) {
        return s.getAsLong();
    }

    public static double get(DoubleSupplier s) {
        return s.getAsDouble();
    }
}
