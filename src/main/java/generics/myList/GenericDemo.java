package generics.myList;

public class GenericDemo {
    public static void main(String[] args) {
        MyList myList = new MyList(3);

        myList.addItem(1, 0);
        myList.addItem(8, 1);

        System.out.println(myList.getItem(0));
        System.out.println(myList.getItem(1));
    }
}
