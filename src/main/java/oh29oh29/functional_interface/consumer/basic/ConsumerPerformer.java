package oh29oh29.functional_interface.consumer.basic;

import java.util.List;

public class ConsumerPerformer {

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }
}
