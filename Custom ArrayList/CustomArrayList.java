public class CustomArrayList<T>
{
    private Object[] arr;
    private int size;
    private final int initial_capacity=10;

public CustomArrayList()
{
    arr=new Object[initial_capacity];
    size=0;
}
//add method
public void add(T element)
{
    ensureCapacity();
    arr[size++]=element;
}
//get method
public T get(int index)
{
    checkIndex(index);
    return (T) arr[index];
}
//remove method
public T remove(int index)
{
    checkIndex(index);
    T removed =(T) arr[index];
    for (int i = index; i<size-1; i++) {
        arr[i] = arr[i + 1];
    }
    arr[--size]=null;
    return removed;
}
//current size
public int size()
{
    return size;
}
//to increase array capacity
private void ensureCapacity()
{
    if(size==arr.length)
    {
        int newCapacity=arr.length*2;
        Object[] newArr=new Object[newCapacity];
        for (int i = 0; i<arr.length;i++) {
            newArr[i] = arr[i];
        }
        arr=newArr;
    }
}
//check valid index or not for get and remove
private void checkIndex(int index)
{
    if(index<0 || index>=size)
    {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}
// remove all element
public void clear()
{
    for(int i=0;i<size;i++)
    {
        arr[i]=null;
    }
size=0;
}
//isEmpty
public boolean isEmpty() 
{
    return size == 0;
}
//set value in particular index
public void set(int index, T element) 
{
    checkIndex(index);
    arr[index] = element;
}
//contains
public boolean contains(T element)
{
    for(int i=0;i<size;i++)
    {
        if(arr[i].equals(element))
        {
            return true;
        }
    }
    return false;
}
//index of
public int indexOf(T element)
{
    for(int i=0;i<size;i++)
    {
        if(arr[i].equals(element))
        {
            return i;
        }
    }
    return -1;
}
//to print arraylist
public void printList()
{
    System.out.println("ArrayList : ");
    System.out.print("[");
    for(int i=0;i<size;i++)
    {
        if(i==size-1)
            System.out.print(arr[i]);
        else
            System.out.print(arr[i]+", ");
    }
    System.out.print("]");
    System.out.println();
}
}