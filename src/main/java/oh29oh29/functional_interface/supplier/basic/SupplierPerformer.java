package oh29oh29.functional_interface.supplier.basic;

public class SupplierPerformer {

    public static <T> T get(Supplier<T> s) {
        return s.get();
    }
}
