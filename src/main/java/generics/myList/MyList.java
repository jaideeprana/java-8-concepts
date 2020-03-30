package generics.myList;

public class MyList {
    private Object[] items;

    public MyList(int length) {
        this.items = new Object[length];
    }

    public void addItem(Object item, int index) {
        this.items[index] = item;
    }

    public Object getItem(int index) {
        return items[index];
    }
}
