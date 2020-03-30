package generics.array;

public class GenericDemo {
    public static void main(String[] args) {
        String[] someStrings = new String[]{"Blah", "Foo"};
        Integer[] someNumbers = new Integer[]{1, 2, 3};

        ArrayUtil.printArray(someNumbers);
        ArrayUtil.printArray(someStrings);
    }
}
