package ds;

import java.lang.reflect.Field;
import java.util.*;

public class parallelSortedArrayList<E> extends ArrayList<E> {

    private static final Field elementDataField;

    static {
        try {
            elementDataField = ArrayList.class.getDeclaredField("elementData");
            elementDataField.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            throw new Error(e);
        }
    }

    public parallelSortedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public parallelSortedArrayList() {
    }

    public parallelSortedArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public void sort(Comparator<? super E> c) {
        try {
            int expectedModCount = this.modCount;
            Arrays.parallelSort((E[]) elementDataField.get(this), 0, this.size(), c);
            if (this.modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            } else {
                ++this.modCount;
            }
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }
}
