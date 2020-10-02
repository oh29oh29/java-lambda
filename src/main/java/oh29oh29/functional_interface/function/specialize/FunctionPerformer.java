package oh29oh29.functional_interface.function.specialize;

import java.util.function.*;

public class FunctionPerformer {

    public static <R> R map(int value, IntFunction<R> f) {
        return f.apply(value);
    }

    public static double map(int value, IntToDoubleFunction f) {
        return f.applyAsDouble(value);
    }

    public static long map(int value, IntToLongFunction f) {
        return f.applyAsLong(value);
    }

    public static <R> R map(long value, LongFunction<R> f) {
        return f.apply(value);
    }

    public static double map(long value, LongToDoubleFunction f) {
        return f.applyAsDouble(value);
    }

    public static int map(long value, LongToIntFunction f) {
        return f.applyAsInt(value);
    }

    public static <R> R map(double value, DoubleFunction<R> f) {
        return f.apply(value);
    }

    public static int map(double value, DoubleToIntFunction f) {
        return f.applyAsInt(value);
    }

    public static long map(double value, DoubleToLongFunction f) {
        return f.applyAsLong(value);
    }

    public static <T> int map(T value, ToIntFunction<T> f) {
        return f.applyAsInt(value);
    }

    public static <T> double map(T value, ToDoubleFunction<T> f) {
        return f.applyAsDouble(value);
    }

    public static <T> long map(T value, ToLongFunction<T> f) {
        return f.applyAsLong(value);
    }
}
