package oh29oh29.functional_interface.function.basic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class FunctionPerformerTest {

    @Test
    public void map() {
        // given
        final List<Integer> values = List.of(1, 2, 3, 4, 5);

        // when
        final List<String> result = FunctionPerformer.map(values, (Integer a) -> "value:" + a);

        // then
        assertArrayEquals(new String[]{"value:1", "value:2", "value:3", "value:4", "value:5"}, result.toArray());
    }
}
