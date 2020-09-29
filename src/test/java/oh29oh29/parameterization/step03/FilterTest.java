package oh29oh29.parameterization.step03;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.AppleCreator;
import oh29oh29.parameterization.data.Color;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FilterTest {

    @Test
    public void filterApples_녹색_사과_필터링() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterApples(apples, Color.GREEN, 0, true);

        // then
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals(Color.GREEN, result.get(0).getColor());
    }

    @Test
    public void filterApplesByColor_무게_100초과_사과_필터링() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterApples(apples, null, 100, false);

        // then
        assertNotNull(result);
        assertEquals(3, result.size());
        assertTrue(result.get(0).getWeight() > 100);
    }
}
