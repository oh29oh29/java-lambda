package oh29oh29.parameterization.step02;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.AppleCreator;
import oh29oh29.parameterization.data.Color;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FilterTest {

    @Test
    public void filterApplesByColor_녹색() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterApplesByColor(apples, Color.GREEN);

        // then
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals(Color.GREEN, result.get(0).getColor());
    }

    @Test
    public void filterApplesByColor_빨간색() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterApplesByColor(apples, Color.RED);

        // then
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals(Color.RED, result.get(0).getColor());
    }
}
