import java.lang.reflect.Array;

public class MyUnimprovedArrayList<E> {
    private E[] array;
    private int index;
    private static final int DEFAULT_SIZE = 10;

    public MyUnimprovedArrayList() {
        array = (E[]) new Object[DEFAULT_SIZE];
        index = 0;
    }

    public E get(int index) throws MyArrayIndexOutOfBounds {
        if (index > this.index - 1) {
            throw new MyArrayIndexOutOfBounds("The index entered is out of bounds.");
        }

        if (index < 0) {
            throw new MyArrayIndexOutOfBounds("The index must be a positive number.");
        }

        return array[index];
    }

    public void add(E obj) {
        if (index == array.length - 1) {
            E[] bigger = (E[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                bigger[i] = array[i];
            }
            array = bigger;
        }
        array[index] = obj;
        index++;
    }

    public void remove(int index) throws MyArrayIndexOutOfBounds {
        if (index > this.index - 1) {
            throw new MyArrayIndexOutOfBounds("The index entered is out of bounds.");
        }

        if (index < 0) {
            throw new MyArrayIndexOutOfBounds("The index must be a positive number.");
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        this.index--;
    }

    public int size() {
        return index;
    }
}
