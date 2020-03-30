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


        System.out.println("Is 4 divisible by 2? " + Math.isEven.test(4));
        System.out.println("3 'not' divisible by 2? " + Math.isEven.negate().test(3));
        System.out.println("Is the number 27 either divisible 3 or 2? " + Math.isEven.or(Math.isDivisibleByThree).test(27));
        System.out.println("Is the number 7 either divisible 3 or 2? " + Math.isEven.or(Math.isDivisibleByThree).test(7));
    }
}
