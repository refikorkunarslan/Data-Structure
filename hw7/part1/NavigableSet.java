import java.util.Iterator;

public interface NavigableSet<E> {
    public void insert(E item);
    public E delete(E item);
    public Iterator descendingIterator();
    public Iterator iterator();
    public NavigableSet headSet(Object toElement, boolean inclusive);
    public NavigableSet tailSet(Object fromElement, boolean inclusive);
}
