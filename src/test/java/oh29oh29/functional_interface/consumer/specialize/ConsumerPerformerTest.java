package oh29oh29.functional_interface.consumer.specialize;

import org.junit.Test;

public class ConsumerPerformerTest {

    @Test
    public void intConsumer() {
        // given
        final int value = 10;

        // when & then
        ConsumerPerformer.accept(value, (int a) -> System.out.println("int value: " + a));
    }

    @Test
    public void longConsumer() {
        // given
        final long value = 10L;

        // when & then
        ConsumerPerformer.accept(value, (long a) -> System.out.println("long value: " + a));
    }

    @Test
    public void doubleConsumer() {
        // given
        final double value = 10.0;

        // when & then
        ConsumerPerformer.accept(value, (double a) -> System.out.println("double value: " + a));
    }
}
