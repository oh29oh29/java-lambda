package oh29oh29.parameterization.step05;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        final List<T> result = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }

        return result;
    }
}
