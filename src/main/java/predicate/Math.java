package predicate;

import java.util.function.Predicate;

public class Math {
    public static Predicate<Integer> isEven = number -> number % 2 == 0;

    public static Predicate<Integer> isDivisibleByThree = number -> number % 3 == 0;
}
