import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class HashMap<K,V> implements Map<K, V>
{
    private Entry[] table;
    private int size;

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    /**
     * Constructs an empty <tt>HashMap</tt> with the specified capacity.
     */

    public HashMap(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException(
                    "Illegal capacity: " + capacity);
        table = new Entry[capacity];
        size = 0;
    }

    /**
     * Constructs an empty <tt>HashMap</tt> with the default capacity (16).
     */
    public HashMap() {
        this(16);
    }

    /**
     * Returns the number of key-value mappings in this map.
     */
    public int size() {
        return size;
    }

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     */
    public V get(Object key) {
        int hash = key.hashCode();
        int index =  hash % table.length;

        // search for the specified key
        for (Entry<K,V> e = table[index]; e != null; e = e.next) {
            if ( (key == e.key ||
                    (key != null && key.equals(e.key)))) {
                return e.value;
            }
        }
        return null;
    }



    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     */
    public V put(K key, V value) {
        HashIterator a=new HashIterator(key);
        a.put(key,value);
        return  value;
    }

    /**
     * Copies all of the mappings from the specified map to this map.
     */
    public void putAll(Map<? extends K, ? extends V> m) {
        if (m.size() == 0)
            return;

        for (Iterator<? extends Map.Entry<? extends K, ? extends V>> i =
             m.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry<? extends K, ? extends V> e = i.next();
            put(e.getKey(), e.getValue());
        }
    }



    /**
     * Removes all of the mappings from this map.
     */
    public void clear() {
        for (int index = 0; index < table.length; index++)
            table[index] = null;
        size = 0;
    }

    private static class Entry<K, V> {
        /** The key */
        private final K key;
        /** The value */
        private V value;
        private Entry<K,V> next;

        public Entry(K key, V value, Entry<K,V> next) {
            this.key = key;
            this.value = value;
            this.next=next;

        }
        /** Retrieves the key.
         @return The key
         */
        public K getKey() {
            return key;
        }
        /** Retrieves the value.
         @return The value
         */
        public V getValue() {
            return value;
        }
        /** Sets the value.
         @param val The new value
         @return The old value
         */
        public V setValue(V val) {
            V oldVal = value;
            value = val;
            return oldVal;
        }
    }

    /**
     * Provides a skeletal implementation of a hash iterator over the
     * elements in this hash map.
     */
    public class HashIterator<E> {
        private int index;
        private Entry<K,V> currEntry;
        private Entry<K,V> nextEntry;

        // initialize the iterator to the first entry.
        public HashIterator(K key) {
            int flag=0;
            if(table==null)
            {
                for (index = 0 ; index < table.length; index++)
                {
                    if( table[index].getKey()==key)
                    {
                        currEntry = table[index];
                        nextEntry = table[index+1];
                        flag=1;
                        return;
                    }
                }

            }


                index=0;
                currEntry = null;
                nextEntry = null;
                for ( ; index < table.length; index++)
                    if (table[index] != null)
                        nextEntry = table[index];


        }
        public HashIterator() {
            index = 0;
            currEntry = null;
            nextEntry = null;
            for ( ; index < table.length; index++)
                if (table[index] != null)
                    nextEntry = table[index];
        }

        public boolean hasNext() {
            if(nextEntry != null)
            {
                return true;
            }
            return false;
        }


        // the next() method has to be implemeted for the specific type
        // T, by extending the abstract class, and making use of the
        // more generic nextEntry() method here below.

        public K next() {
            currEntry = nextEntry;
            if (nextEntry.next != null) {
                nextEntry = nextEntry.next;
            } else {
                nextEntry = null;
                index = (index + 1) % table.length;
                nextEntry = table[index];
            }

            return currEntry.getKey();
        }

        public V put(K key, V value) {
            int hash = key.hashCode();
            int index =hash % table.length;

            // check if the key is already contained: update the value
            for (Entry<K,V> e = table[index]; e != null; e = e.next) {
                if ((key == e.key ||
                        (key != null && key.equals(e.key)))) {
                    V oldValue = e.value;
                    e.value = value;
                    return oldValue;
                }
            }

            // insert the new mapping at the beginning of the list
            Entry<K,V> e = new Entry( key, value, table[index]);
            table[index] = e;
            size++;
            return null;
        }


    }




}