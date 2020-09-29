package oh29oh29.parameterization.step03;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.Color;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
        final List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }

        return result;
    }
}
