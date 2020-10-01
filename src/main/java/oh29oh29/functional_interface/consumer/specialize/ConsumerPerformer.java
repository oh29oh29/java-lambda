package oh29oh29.functional_interface.consumer.specialize;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerPerformer {

    public static void accept(int value, IntConsumer c) {
        c.accept(value);
    }

    public static void accept(long value, LongConsumer c) {
        c.accept(value);
    }

    public static void accept(double value, DoubleConsumer c) {
        c.accept(value);
    }
}
