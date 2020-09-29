package oh29oh29.parameterization.step02;

import oh29oh29.parameterization.data.Apple;
import oh29oh29.parameterization.data.Color;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        final List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }

        return result;
    }
}
