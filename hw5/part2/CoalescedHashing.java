public class CoalescedHashing<K, V> implements KWHashMap<K, V> {

    // Data Fields
    public EntryOpen<K, V>[] table;
    private static final int START_CAPACITY = 10;
    private double LOAD_THRESHOLD = 0.75;
    private int numKeys;
    private int numDeletes;
    private final EntryOpen<K, V> DELETED = new EntryOpen<>(null, null,null);

    //inner EntryOpen class for hold pairs
    public static class EntryOpen<K,V>{
        /** The key */
        private final K key;
        /** The value */
        private V value;
        private EntryOpen<K,V> next;

        public EntryOpen<K, V> getNext() {
            return next;
        }

        public void setNext(EntryOpen<K, V> next) {
            this.next = next;
        }

        /**
         *
         * @param key ds
         * @param value ca
         * @param next next
         */

        public EntryOpen(K key, V value,EntryOpen<K,V> next) {
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

    public CoalescedHashing(){
        table = new EntryOpen[START_CAPACITY];
    }

    /** Finds either the target key or the first empty slot in the
     search chain using linear probing.
     @pre The table is not full.
     @param key The key of the target object
     @return The position of the target or the first empty slot if
     the target is not in the table.
     */
    private int find(Object key) {
        // Calculate the starting index.
        int index = key.hashCode()% table.length;
        if (index < 0)
            index += table.length; // Make it positive.

        while ((table[index] != null)
                && (!key.equals(table[index].getKey()))) {
            index++;
            if(index>=table.length)
                index=0;
        }
        return index;
    }


    /** Method get for class HashtableOpen.
     @param key The key being sought
     @return the value associated with this key if found;
     otherwise, null
     */
    @Override
    public V get(Object key) {
        // Find the first table element that is empty
        // or the table element that contains the key.
        int index = find(key);
        // If the search is successful, return the value.
        if (table[index] != null)
            return table[index].getValue();
        else
            return null; // key not found.
    }




  
    @Override
    public V put(K key, V value) {
        // Find the first table element that is empty
        // or the table element that contains the key.
        int index = key.hashCode()%10;
        int probeNum=1;
        if(table[index] == null)
        {

            table[index] = new EntryOpen(key, value,null);
            V oldVal = table[index].getValue();
            table[index].setValue(value);
            return oldVal;

        }
        while (table[index] != null)
       {
           int a=index;
           index = (index + probeNum * probeNum) % table.length;

           if(table[index] == null)
           {
               table[index] = new EntryOpen(key, value,null);
               table[index].setValue(value);
               table[a].next=table[index];
               return  table[index].getValue();

           }

           probeNum++;
       }

        return  table[index].getValue();

    }

    @Override
    public V remove(Object key) {
        int index = key.hashCode()%10;

        if(table[index] ==null)
        {
            return null;
        }
        EntryOpen<K, V>[] tab =table;

        while(tab[index].getNext() !=null)
        {
            if(tab[index].getNext() ==null && tab[index].getKey() == key)
            {

                V value = tab[index].getValue();
                tab[index] = DELETED;
                return value;
            }
            else if(tab[index].getKey() ==key)
            {

                while(tab[index].getNext() !=null)
                {
                    tab[index]=tab[index].getNext();

                }
                tab[index].setNext(null);
                V value =tab[index].getValue();

                return value;
            }
            else
            {
                tab[index]=tab[index].getNext();

            }

        }

        return null;

    }

    @Override
    public int size() {
        return numKeys;
    }

    @Override
    public boolean isEmpty() {
        if(size()==0){
            return true;
        }
        return false;
    }

    /** Expands table size when loadFactor exceeds LOAD_THRESHOLD
     @post The size of the table is doubled and is an odd integer.
     Each nondeleted entry from the original table is
     reinserted into the expanded table.
     The value of numKeys is reset to the number of items
     actually inserted; numDeletes is reset to 0.
     */
    private void rehash() {
        // Save a reference to oldTable.
        EntryOpen<K, V>[] oldTable = table;
        // Double capacity of this table.
        table = new EntryOpen[2 * oldTable.length + 1];
        // Reinsert all items in oldTable into expanded table.
        numKeys = 0;
        numDeletes = 0;
        for (int i = 0; i < oldTable.length; i++) {
            if ((oldTable[i] != null) && (oldTable[i] != DELETED)) {
                // Insert entry in expanded table
                put(oldTable[i].getKey(), oldTable[i].getValue());
            }
        }
    }
}