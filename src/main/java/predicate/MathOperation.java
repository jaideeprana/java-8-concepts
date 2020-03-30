package predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MathOperation {
    List<Integer> filterNumbers(List<Integer> numberList, Predicate<Integer> predicate) {
        return numberList.stream().filter(predicate).collect(Collectors.toList());
    }
}
