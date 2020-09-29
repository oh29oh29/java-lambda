package oh29oh29.parameterization.step04;

import oh29oh29.parameterization.data.Apple;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        final List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
