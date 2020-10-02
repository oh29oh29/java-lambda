package oh29oh29.functional_interface.function.basic;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
