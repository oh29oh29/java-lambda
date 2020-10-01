package oh29oh29.functional_interface.predicate.specialize;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicatePerformer {

    public static boolean filter(int value, IntPredicate p) {
        return p.test(value);
    }

    public static boolean filter(long value, LongPredicate p) {
        return p.test(value);
    }

    public static boolean filter(double value, DoublePredicate p) {
        return p.test(value);
    }
}
