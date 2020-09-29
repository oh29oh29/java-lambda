package oh29oh29.parameterization.step01;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.AppleCreator;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FilterTest {

    @Test
    public void filterGreenApples() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterGreenApples(apples);

        // then
        assertNotNull(result);
        assertEquals(3, result.size());
    }
}
