package oh29oh29.parameterization.data;

import java.util.List;

public class AppleCreator {

    public static List<Apple> createApples() {
        return List.of(
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150),
                new Apple(Color.RED, 80),
                new Apple(Color.GREEN, 180),
                new Apple(Color.RED, 200),
                new Apple(Color.GREEN, 50)
        );
    }
}