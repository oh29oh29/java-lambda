package oh29oh29.functional_interface.consumer.basic;

import org.junit.Test;

import java.util.List;

public class ConsumerPerformerTest {

    @Test
    public void forEach() {
        // given
        final List<Integer> values = List.of(1, 2, 3, 4, 5);

        // when & then
        ConsumerPerformer.forEach(
                values,
                (Integer i) -> System.out.println("value: " + i)
        );
    }
}
