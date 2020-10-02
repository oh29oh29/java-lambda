package oh29oh29.functional_interface.predicate.basic;

import java.util.ArrayList;
import java.util.List;

public class PredicatePerformer {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        final List<T> result = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }

        return result;
    }
}
