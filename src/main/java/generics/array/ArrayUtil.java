package generics.array;

import java.util.Arrays;

public class ArrayUtil {
    public static <E> void printArray(E[] inputArray) {
        Arrays.stream(inputArray).forEach(element -> System.out.println(element));
    }
}
