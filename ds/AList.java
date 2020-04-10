
/*List relize by Array.*/
public class AList<Ele> {
    private Ele[] elements;
    private int size;
    private static int DEFAULT_SIZE = 16;
    private static int RFACTOR = 2;

    public AList(){
        this(DEFAULT_SIZE);
    }
    public AList(int length){
        this.elements = (Ele[]) new Object[length];
    }

    /*维护几个变量  elements elements[size-1] size */
    public void addLast(Ele element){
        if (size==elements.length){
            reSize(size*RFACTOR);
        }
        elements[size] = element;
        size = size+1;
    }
    public Ele getLast(){
        return elements[size-1];
    }
    public Ele get(int i){
        return elements[i];
    }
    public int size(){
        return this.size;
    }
    public void removeLast(){
        elements[size-1] = null;
        size = size-1;
    }
    private void reSize(int k){
        Ele[]newElements = (Ele[])new Object[k];
        System.arraycopy(elements,0,newElements,0,size);
        elements = newElements;
        System.out.println("扩容一次");
    }
}
