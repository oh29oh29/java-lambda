package oh29oh29.functional_interface.predicate.basic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class PredicatePerformerTest {

    @Test
    public void filter() {
        // given
        final List<Integer> values = List.of(1, 2, 3, 4, 5);

        // when
        final List<Integer> result = PredicatePerformer.filter(values, (Integer a) -> a % 2 == 1);

        // then
        assertArrayEquals(new Integer[]{1, 3, 5}, result.toArray());
    }
}
