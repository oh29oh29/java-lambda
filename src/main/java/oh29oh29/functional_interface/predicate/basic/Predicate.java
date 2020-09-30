package oh29oh29.functional_interface.predicate.basic;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
