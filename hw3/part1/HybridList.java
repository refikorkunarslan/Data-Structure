import java.util.ListIterator;
import java.util.NoSuchElementException;

public class HybridList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    private int nodeSize =0;
    /***
     * @param e element to be appended to this list
     * @return true if this collection changed as a result of the call
     */
    public boolean add(E e){
        HybridListIterator iter = new  HybridListIterator (size);
        iter.add (e);
        return true;
    }

    /***
     * @param index index at which the specified element is to be inserted
     * @param obj element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void add(int index,E obj){
        HybridListIterator iter = new  HybridListIterator (index);
        iter.add (obj);
    }
    /***
     * @param obj new element that will be added.
     */
    public void addFirst(E obj){
        HybridListIterator iter = new  HybridListIterator (0);
        iter.add (obj);
    }
    /***
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */

    public E get (int index) {
        HybridListIterator iter = new  HybridListIterator (index);
        return iter.get ();
    }
    /***
     * @return the first element in this list.
     */
    public E getFirst(){
        HybridListIterator iter = new  HybridListIterator (0);
        return iter.get ();
    }
    /***
     * @return the last element in this list.
     */
    public E getLast(){
        HybridListIterator iter = new HybridListIterator (size-1);
        return iter.get ();
    }

    /***
     * @param obj element to be removed from this list, if present
     * @return true if this list contained the specified element, otherwise false
     */
    public boolean remove(Object obj){
        HybridListIterator iter = new HybridListIterator (0);
        int index;
        while (iter.hasNext ()){
            if (iter.next ().equals (obj)){
                index=iter.nextItem.searchAndGetIndex ((E)obj);
                iter.nextItem.remove (index);
                size--;
                if (iter.nextItem.getSize () == 0)
                    iter.remove ();
                return true;
            }
        }
        return false;
    }

    /***
     * @param index the index of the element to be removed
     * @return removed first element at the specified position in this list.
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E remove(int index){
        HybridListIterator iter = new HybridListIterator (index);
        size--;
        E temp = iter.nextItem.remove (iter.arrayIndex);
        if (iter.nextItem.getSize ()==0){
            iter.remove ();
        }
        return temp;
    }
    /***
     * @return size of the list.
     */
    public int size () {
        return size;
    }

    /***
     * @return node size of the linked list.
     */
    public int getNodeSize(){
        return nodeSize;
    }
    /***
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in this list
     */
    public int indexOf (Object o) {
        HybridListIterator iter = new HybridListIterator (0);
        int index,i=0;
        while (iter.hasNext ()){
            if (iter.next ().equals (o)){
                return iter.elementIndex-1;
            }
        }
        return -1;
    }

    /***
     * @return  MyListIterator over the elements in this list (in proper sequence)
     */
    public HybridListIterator HybridListIterator(){
        return new HybridListIterator (0);
    }

    /***
     * @param index index of the first element to be returned from the list iterator (by a call to next)
     * @return MyListIterator over the elements in this list (in proper sequence),
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public HybridListIterator HybridListIterator(int index){
        return new HybridListIterator (index);
    }

    /***
     * @return true if this list contains no elements.
     */
    public boolean isEmpty () {
        return size==0;
    }
    /***
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains (Object o) {
        HybridListIterator iter = new HybridListIterator (0);
        while (iter.hasNext ()){
            if (iter.next ().equals (o)){
                return true;
            }
        }
        return false;
    }

    /***
     * @return a string to print list to the screen in a good shape.
     */
    private class HybridListIterator implements ListIterator<E> {
        private Node<E> nextItem;
        private Node<E> lastItem;
        private int index;
        private int flag;
        private int elementIndex;
        private E nextElement;
        private int arrayIndex;
        /***
         * @param i starting position of the iterator
         */
        public HybridListIterator(int i){
            if (i<0 || i>size)
                throw new IndexOutOfBoundsException("Invalid Index"+i);
            lastItem = null;
            if (i==size){
                index=nodeSize;
                nextItem = tail;
                elementIndex=size;
                arrayIndex = 0;
                flag = 1;
            }
            else if(i==0){
                arrayIndex =0;
                elementIndex =0;
                index=0;
                nextItem = head;
                flag = 2;
                int k =0;
                nextElement = nextItem.get (k);
            }
            else{
                arrayIndex =0;
                elementIndex =0;
                index=0;
                nextItem = head;
                flag = 2;
                int k =0;
                nextElement = nextItem.get (k);
                for (int j =0 ;j<=i;j++){
                    if (nextItem.getSize () == k){
                        nextItem=nextItem.next;
                        index++;
                        k=0;
                        arrayIndex=0;
                        nextElement = nextItem.get (k);
                        k++;
                    }
                    else{
                        nextElement = nextItem.get (k);
                        k++;
                        arrayIndex++;
                        elementIndex++;
                    }
                }
            }

        }

        /***
         * @param obj the element to insert
         */
        public void add(E obj){
            if (nextItem!=null){
                if (!nextItem.is_full ()){
                    nextItem.add (obj);
                }
                else{
                    if (nextItem == head && flag == 2){
                        Node<E> newNode= new Node<E> (obj);
                        newNode.next = nextItem;
                        nextItem.prev=newNode;
                        head = newNode;
                        index++;
                        nodeSize++;
                    }
                    else if (nextItem == tail && flag == 1){
                        Node<E> newNode = new Node<E>(obj);
                        tail.next = newNode;
                        newNode.prev = tail;
                        tail = newNode;
                        index++;
                        nodeSize++;
                    }
                    else{
                        Node<E> newNode = new Node<> (obj);
                        newNode.prev = nextItem.prev;
                        nextItem.prev.next = newNode;
                        newNode.next = nextItem;
                        nextItem.prev = newNode;
                        index++;
                        nodeSize++;
                    }
                }
            }
            else{
                head =new Node<> (obj);
                tail = head;
                index++;
                nodeSize++;
            }
            size++;
            lastItem = null;
        }

        /***
         * @return true if the list iterator has more elements when traversing the list in the forward direction.
         */
        public boolean hasNext(){
            return nextItem!= null;
        }

        /***
         * @return true if the list iterator has more elements when traversing the list in the reverse direction.
         */
        public boolean hasPrevious(){
            return nodeSize!=0 && nextItem!= null && nextItem.prev !=null;
        }
        /***
         * @return the next element in the list
         * @throws NoSuchElementException if the iteration has no next element
         */
        public E next(){
            if (!hasNext ()){
                throw new NoSuchElementException ();
            }
            if (arrayIndex>=nextItem.getSize ()){
                lastItem = nextItem;
                nextItem =nextItem.next;
                index++;
                arrayIndex=0;
            }
            if (nextItem!=null){
                nextElement = nextItem.get (arrayIndex);
                elementIndex++;
                arrayIndex++;
                return nextElement;
            }
            else{
                return nextElement;
            }
        }

        /***
         * @return the index of the element that would be returned by a subsequent call to next,
         */
        public int nextIndex(){
            return elementIndex+1;
        }
        /***
         * @return the previous element in the list.
         * @throws NoSuchElementException if the iteration has no previous element.
         */
        public E previous(){
            if (!hasPrevious ())
                throw new NoSuchElementException ();
            if (nextItem == null)
                nextItem = tail;
            else{
                if (arrayIndex==0){
                    nextItem = nextItem.prev;
                    lastItem = nextItem;
                    index--;
                    arrayIndex = nextItem.getSize ();
                }
                arrayIndex--;
                elementIndex--;
                nextElement = nextItem.get (arrayIndex);
            }
            return nextElement;
        }

        /***
         * @return the index of the element that would be returned by a subsequent call to previous,
         */
        public int previousIndex(){
            return elementIndex-1;
        }

        /***
         * @throws NoSuchElementException if the list is empty
         */
        public void remove(){
            if (head == null){
                throw new NoSuchElementException ();
            }
            else if (head != null && head.next == null){
                nextItem = null;
                head = null;
                tail = null;
                nodeSize--;
                index--;
            }
            else if (nextItem.next == null){
                nextItem.prev.next = null;
                tail = nextItem.prev;
                nodeSize--;
                index--;
            }
            else if (nextItem.prev == null && nextItem.next !=null){
                nextItem.next.prev =null;
                head = nextItem.next;
                nodeSize--;
                index--;
            }
            else{
                nextItem.prev.next = nextItem.next;
                nextItem.next.prev = nextItem.prev;
                nodeSize--;
                index--;
            }
            lastItem = null;
        }

        /***
         * @param e the element with which to replace the last element returned by next or previous.
         * @throws IllegalStateException if neither next nor previous have been called,
         */
        public void set(E e){
            if (lastItem!=null){
                lastItem.set (lastItem.getSize ()-1,e);
            }
            else{
                throw new IllegalStateException ();
            }
        }
        public E get(){
            return nextElement;
        }
    }

    /***
     * @param <E> Type of each node.
     */
    private static class Node<E>{
        private KWArrayList<E> data;
        private Node<E> next;
        private Node<E> prev;
        private int size;
        private int capacity;
        /***
         * constructor
         */
        public Node(){
            capacity = 10;
            size=0;

            next = null;
            prev = null;
        }
        /***
         * @param element the element to insert.
         */
        public Node(E element){
            capacity = 10;
            size=0;
            data = new KWArrayList<>();
            data.add(size,element);
            size++;
            next = null;
            prev = null;
        }
        /***
         * @param data the array to insert.
         * @param size size of array.
         */
        public Node(KWArrayList<E> data,int size){
            this.data = data;
            this.size = size;
            capacity = data.size();
            next = null;
            prev = null;
        }

        /***
         * @param data arrayList to insert
         * @param size size of array
         * @param n next reference
         * @param p prev reference
         */
        public Node(KWArrayList<E>  data,int size,Node<E> n ,Node<E> p){
            this.data = data;
            this.size = size;
            capacity = data.size();
            next = n;
            prev= p;
        }
        /***
         * @param value element to be appended to this array.
         * @throws ArrayIndexOutOfBoundsException if the array size is full
         */
        public void add(E value){
            if (is_full ()){
                throw new ArrayIndexOutOfBoundsException();
            }
            data.add(size,value);
            size++;
        }
        /***
         * @param index the index of the element to be removed
         * @return removed element.
         * @throws ArrayIndexOutOfBoundsException if the index is out of range
         */
        public E remove(int index){
            if (!checkBorder(index))
                throw new ArrayIndexOutOfBoundsException(index);
            E temp = data.get(index);
            // shift the elements (coming after the removed element)
            for (int i = index + 1 ; i < size; i++){
                data.set(i-1,data.get(i));
            }
            size--;
            return temp;
        }
        /***
         * @param item element will be searched.
         * @return  if finds return index of the element,otherwise return -1
         */
        public int searchAndGetIndex(E item){
            for (int i = 0; i<size;i++){
                if (data.get(i).equals (item)){
                    return i;
                }
            }
            return -1;
        }

        /***
         * @param index index of the element to return
         * @return the element at the specified position in this list
         * @throws ArrayIndexOutOfBoundsException if the index is out of range
         */
        public E get(int index){
            if (!checkBorder(index))
                throw new ArrayIndexOutOfBoundsException(index);
            return data.get(index);
        }

        /***
         * @param index index of the element to replace
         * @param newValue element to be stored at the specified position
         * @throws ArrayIndexOutOfBoundsException if the index is out of range
         */
        public void set(int index, E newValue){
            if (!checkBorder(index))
                throw new ArrayIndexOutOfBoundsException(index);
            data.set(index, newValue);
        }

        /***
         * @return size of array.
         */
        public int getSize(){return size;}

        /***
         * @return true if array is full,otherwise false
         */
        public boolean is_full(){
            return capacity==size;
        }

        /***
         * @param index index value will be checked.
         * @return true if index is okay otherwise false
         */
        private boolean checkBorder(int index){
            return index >= 0 && index < size;
        }

        /***
         * @param obj the Node to be compared for equality with this Node
         * @return true if the specified Node is equal to this Node
         */
        @Override
        public boolean equals (Object obj) {
            if (obj == null)
                return false;
            if (getClass () != obj.getClass ())
                return false;
            Node<E> temp = (Node<E>)obj;
            if (next!= temp.next || prev != temp.prev || size!= temp.size || capacity!= temp.capacity)
                return false;
            else{
                for (int i=0;i<getSize ();i++){
                    if (!get (i).equals (temp.get (i)))
                        return false;
                }
            }
            return true;
        }


    }
}
