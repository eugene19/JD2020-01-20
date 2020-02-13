package by.it.dolgiy.jd01_11;



import java.util.*;

class ListB<T> implements List<T> {

    private T[] elements = (T[]) new Object[0];
    private int size;

    @Override
    public boolean add(T t) {
        if (size==elements.length){
            elements=Arrays.copyOf(elements,elements.length*3/2+1);
        }
        elements[size++]=t;
        return true;
    }

    @Override
    public T remove(int index) {
        T element = elements[index];
        System.arraycopy(elements,index+1,elements,index,--size-index);
        return element;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i<size-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    // A

    @Override
    public T set(int index, T element) {
        T start = elements[index];
        elements[index] = element;
        return start;
    }

    @Override
    public void add(int index, T element) {
        if (size==elements.length){
            elements=Arrays.copyOf(elements, elements.length*3/2+1);
        }
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index] = element;
        size++;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] a = this.elements;
        int numNew = a.length;
        if (size== elements.length){
            this.elements =Arrays.copyOf(elements, elements.length*3/2+1);
            System.arraycopy(elements,size,a,numNew,size+numNew);
        }
        return numNew != 0;
    }
    //B

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
