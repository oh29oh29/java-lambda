package oh29oh29.parameterization.step01;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.Color;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        final List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (Color.GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }

        return result;
    }
}
