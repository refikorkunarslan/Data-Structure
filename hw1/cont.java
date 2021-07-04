public class cont<T> {
    private T[] content;
    private int used=0;
    private int capacity=0;


    public T at(int index) throws ArrayIndexOutOfBoundsException
    {
        if(index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException("Invalid index!");

        return content[index];
    }
    public int size() { return used; }
    public boolean insert(T newContent)
    {

        if(newContent == null || contains(newContent) >= 0)
            return false;

        fixCapacity();
        content[size()] = newContent;

        setUsed(size()+1);

        return true;
    }
    public cont()
    {
        setUsed(0);
        setCapacity(1);
    }
    public cont(int cap)
    {
        setUsed(0);
        setCapacity(cap);
    }
    protected void fixCapacity()
    {
        if(size() == getCapacity())
            setCapacity(getCapacity()*2);
    }


    public boolean erase(T content)
    {
        if(content == null || contains(content) == -1)
            return false;

        boolean flag = true;

        for(int i=0 ; i < size() && flag; ++i)
            if(at(i).equals(content))
            {
                this.content[i] = at(size()-1);
                flag = false;
            }

        setUsed(size()-1);
        return true;
    }
    public int contains(Object o)
    {
        if(o == null)
            return -1;

        for(int i=0 ; i < size() ; ++i)
            if(content[i].equals(o))
                return i;
        return -1;
    }

    public int getCapacity() { return capacity; }

    private void setCapacity(int capacity)
    {
        if(capacity < 0)
            capacity = 1;

        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[capacity];

        for(int i=0 ; i < temp.length && i < size() ; ++i)
            temp[i] = at(i);

        setUsed(temp.length > size() ? size() : temp.length-1);
        content = temp;
        this.capacity = capacity;
    }


    public void setUsed(int used) {
        this.used = used;
    }
}
