package predicate;

import java.util.List;

import static java.util.Arrays.asList;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> sampleNumbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        MathOperation mathOperation = new MathOperation();
        List<Integer> evenNumbers = mathOperation.filterNumbers(sampleNumbers, Math.isEven);

        List<Integer> numbersDivisibleByThree = mathOperation.filterNumbers(sampleNumbers, Math.isDivisibleByThree);


        evenNumbers.stream().forEach(number -> System.out.println("Even no: " + number));
        numbersDivisibleByThree.stream().forEach(number -> System.out.println("No divisible by 3: " + number));
    }
}
