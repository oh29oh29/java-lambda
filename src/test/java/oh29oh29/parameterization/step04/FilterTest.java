package oh29oh29.parameterization.step04;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.AppleCreator;
import oh29oh29.parameterization.data.Color;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FilterTest {

    public static class AppleRedAndHeavyPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return Color.RED.equals(apple.getColor()) && apple.getWeight() > 100;
        }
    }

    @Test
    public void filterApples_빨간색_AND_100초과_사과_필터링() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterApples(apples, new AppleRedAndHeavyPredicate());

        // then
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(Color.RED, result.get(0).getColor());
        assertTrue(result.get(0).getWeight() > 100);
    }

    @Test
    public void filterApples_빨간색_AND_100초과_사과_필터링_익명_클래스_사용() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return Color.RED.equals(apple.getColor()) && apple.getWeight() > 100;
            }
        });

        // then
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(Color.RED, result.get(0).getColor());
        assertTrue(result.get(0).getWeight() > 100);
    }

    @Test
    public void filterApples_빨간색_AND_100초과_사과_필터링_람다_사용() {
        // given
        final List<Apple> apples = AppleCreator.createApples();

        // when
        final List<Apple> result = Filter.filterApples(apples, apple -> Color.RED.equals(apple.getColor()) && apple.getWeight() > 100);

        // then
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(Color.RED, result.get(0).getColor());
        assertTrue(result.get(0).getWeight() > 100);
    }
}
