import java.util.ArrayList;

public class MyArrayList<T> {

    private int arraySize = 0;
    private Object[] array = new Object[arraySize];
    int index = 0;

    void add(T value) {
        resize(array.length + 1);
        array[array.length - 1] = value;
    }

    void add(int index, T value) {
        add(null);
        Object t;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                t = array[i];
                array[i] = value;
                index++;
                value = (T) t;
            }
        }
    }

    void addAll(MyArrayList list) {
        for (int i = 0; i <= list.array.length-1; i++) {
            add((T) list.array[i]);
        }
    }

    T get(int index) { return (T) array[index]; }

    void set(T value, int index) { array[index] = value; }

    T remove(int index) {
        Object obj = new Object();
        obj = array[index];
        array[index] = null;
        return (T) obj;
    }

    T remove(T t) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i].equals(t)) {
                array[i] = null;
                break;
            }
        }
        return t;
    }

    int size(){ return array.length; }

    boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) return false;
            else continue;
        }
        return true;
    }

    private void resize(int newSize) {
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        arraySize = array.length;
    }

    void print() {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}