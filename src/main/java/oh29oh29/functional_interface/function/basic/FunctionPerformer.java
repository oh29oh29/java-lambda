package oh29oh29.functional_interface.function.basic;

import java.util.ArrayList;
import java.util.List;

public class FunctionPerformer {

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        final List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }

        return result;
    }
}
