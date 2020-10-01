package oh29oh29.functional_interface.consumer.basic;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
