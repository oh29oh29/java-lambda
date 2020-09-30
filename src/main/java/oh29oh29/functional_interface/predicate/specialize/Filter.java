package oh29oh29.functional_interface.predicate.specialize;

import java.util.function.IntPredicate;

public class Filter {

    public static boolean filter(int value, IntPredicate p) {
        return p.test(value);
    }
}
