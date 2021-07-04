import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class HeapStructure<E> {

    private ArrayList<E> theData;
    Comparator<E> comparator = null;

    public ArrayList<E> getTheData() {
        return theData;
    }

    public HeapStructure(){
        theData = new ArrayList<E>();
    }

    /**
     * Creates a heap based priority queue with the specified initial capacity that orders its elements according to the specified comparator
     * @param cap The initial capacity for this priority queue
     * @throws IllegalArgumentException if cap is less than 1
     */
    public HeapStructure(int cap,Comparator<E> comp){
        if (cap < 1)
            throw new IllegalArgumentException();
        theData = new ArrayList<E>(cap + 1);
        comparator = comp;
    }
    /**
     * Add an item to the priority queue
     * @param item The item to be added
     * @return true if offer was successful; throws an IllegalState Exception if the result of offer was false
     */

    public boolean add(E item){
        boolean result = offer(item);
        if(!result)
            throw new IllegalStateException("Offer was not succesfull");
        return result;
    }

    /**
     * Insert an item into the priority queue
     * pre: The ArrayList theData is in heap order
     * post: The item is in the priority queue and theData is in heap order
     * @return True if successful; false if the item could not be inserted
     * @throws NullPointerException if the item to be inserted is null
     */
    public boolean offer(E item) {
        ///Add the item to the heap
        theData.add(item);
        //the child is newly inserted item
        int child = theData.size() - 1;
        int parent = (child - 1)/2; //find child's parent
        //reheap
        while(parent >= 0 && compare(theData.get(parent), theData.get(child)) > 0){
            swap(parent, child);
            child = parent;
            parent = (child - 1)/2;
        }
        return true;
    }

    /**
     * Returns the smallest entry without removing it. If the queue is empty, returns null
     * @return The smallest entry or null if empty
     */
    public E peek() {
        if(isEmpty()){
            return null; //if there are no objects in the theData, return null
        } else {
            return theData.get(0); ///return the first item
        }
    }

    /**
     * Returns the smallest entry without removing it. If the queue is empty, throws a NoSuchElementException
     * @return The smallest entry
     */
    public E element(){
        if(isEmpty()){
            throw new NoSuchElementException("No items in the queue");
        } else {
            return theData.get(0);
        }
    }

    /**
     * Remove an item from the priority queue
     * pre: The ArrayList theData is in heap order
     * post: removed smallest item; theData is in heap order
     * @return The item with the smallest priority value or null if empty
     */
    public E poll() {
        if(isEmpty())
            return null;
        //Save the top of the heap
       E result = theData.get(0);
        //If only one item the remove it
        if(theData.size() == 1){
            theData.remove(0);
            return result;
        }
        //Return the last item from the ArrayList and place it into the first position
        theData.set(0, theData.remove(theData.size() - 1));
        //The parent starts at the top
        int parent = 0;
        while(true){
            int leftChild = 2 * parent + 1;
            if (leftChild >= theData.size())
                break; //out of heap
            int rightChild = leftChild + 1;
            int minChild = leftChild; //assume leftChild is smaller
            //see whether rightChild is smaller
            if(rightChild < theData.size() && compare(theData.get(leftChild), theData.get(rightChild)) > 0){
                minChild = rightChild;
            }
            //assert: minChild is the index of the smaller child
            //move smaller child if necessary
            if(compare(theData.get(parent), theData.get(minChild)) > 0){
                swap(parent, minChild);
                parent = minChild;
            } else { //heap property restored
                break;
            }
        }
        return result;
    }

    /**
     * Removes the smallest entry and returns it if the queue is not empty. if the queue is empty, throws a NoSuchElementException
     * @return The smallest entry or throws a NoSuchElementException
     */
    public E remove(){
        E result = poll();
        if (result == null){
            throw new NoSuchElementException("No items in the queue");
        } else {
            return result;
        }
    }

    public Iterator<E> iterator() {
        return theData.iterator();
    }

    public int size() {
        return theData.size();
    }

    /**
     * Compares tow objects and returns a negative number is object left is than object right,
     * zero if they are equal, and a positive number if object iss greater than object right
     * @param left Left item compared
     * @param right Right item compared
     * @return Negative int if left is less than right, 0 if they are equal, and positive int if left is greater than right
     * @throws ClassCastException if items are not comparable
     */
    @SuppressWarnings("unchecked")
    private int compare(E left, E right){
        if(comparator != null){ //use comparator if defined
            return comparator.compare(left, right);
        } else { // use left's compareTo method
            return ((Comparable<E>) left).compareTo(right);
        }
    }

    /**
     * Exchanges the object references at indexes i and j
     * @param i An item to be switched
     * @param j The other item to be switched
     */
    private void swap(int i, int j){
        E first = theData.get(i); //get first reference
        theData.set(i, theData.get(j)); //get second reference and set it to first
        theData.set(j, first);  //set second reference to first reference
    }

    /**
     * Returns whether there is an item in the collection
     * @return true if the queue is empty
     */
    public boolean isEmpty(){
        return theData.size() == 0;
    }

    public String toString(){
        return theData.toString();
    }
    public int searchFor(E target)
    {
        for(int i = 0; i < theData.size(); i++)
        {
            if(target.equals(theData.get(i)))
                return i; //return the index of the first occurence
        }
        return -1; // we did not find the target
    }

    /**
     *
     * @param arr megre resul arr
     * @param a 1.array
     * @param b 2.array
     */
    public  void mergeHeaps(ArrayList<Integer> arr, ArrayList<Integer> a,ArrayList<Integer> b)
    {
        for (int i = 0; i < a.size(); i++) {
            arr.add(i,a.get(i));
        }
        for (int i = 0; i < b.size(); i++) {
            arr.add((a.size()+i) ,b.get(i));
        }
        int n;
        n = a.size() + b.size();

        for (int i = arr.size() / 2 - 1; i >= 0; i--) {
            minHeapify(i,arr);
        }
    }

    /**
     *
     * @param i index
     * @param list array
     */
    private  void minHeapify(int i,ArrayList<Integer> list)
    {

        int left = 2 * i + 1;
        int right =  2 * i + 2;
        int smallest = -1;
        if (left <= list.size() - 1 && list.get(2*i+1) < list.get(i)) {
            smallest = left;
        } else {
            smallest = i;
        }

        if (right <= list.size() - 1 && list.get(2 * i + 2) < list.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {

            swap(i, smallest);
            minHeapify(smallest,list);
        }
    }
    public void removeThLargest(int a)
    {
            E m;
            m=kthLargest(theData,a);
            theData.remove(m);

    }

    /**
     *
     * @param arr search array
     * @param k index
     * @return return vaue
     */
    public E kthLargest( ArrayList<E> arr,int k)
    {
        ArrayList<E> a;
        a=arr;
        bubbleSort(a);
        return a.get(a.size()-k-1);
    }

    /**
     *
     * @param array sort
     */
    public void bubbleSort(ArrayList<E> array) {
        boolean swapped = true;
        int j = 0;
        E tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.size() - j; i++) {
                if (compare(array.get(i),array.get(i+1))>0) {
                    tmp = array.get(i);
                    array.set(i,array.get(i+1));
                    array.set(i+1,tmp);
                    swapped = true;
                }
            }
        }
    }

}