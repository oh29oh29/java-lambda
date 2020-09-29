package oh29oh29.parameterization.step05;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.AppleCreator;
import oh29oh29.parameterization.data.Color;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FilterTest {

    @Test
    public void filter() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filter(apples, apple -> Color.RED.equals(apple.getColor()) && apple.getWeight() > 100);

        // then
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(Color.RED, result.get(0).getColor());
        assertTrue(result.get(0).getWeight() > 100);
    }
}
