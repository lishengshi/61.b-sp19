public class AList<E> {

    private E[] es;
    private int size;
    private static int DEFAULT_SIZE=16;
    public AList(E e){
        this.es=(E[])new Object[DEFAULT_SIZE];
        es[0]=e;
        size+=1;
    }
    public AList(E[] array){
        this(array[0]);
        for (int i=1;i<size;i++){
            es[i]=array[i];
        }
        size=size+array.length;
    }
    public void addLast(E e){
        if (es.length==size){
            reSize(size*2);
        }
        es[size]=e;
        size+=1;
    }
    public void reSize(int length){
        E[] newEs=(E[])new Object[length];
        System.arraycopy(es,0,newEs,0,size);
    }
    public void removeLast(){
        es[size-1]=null;
        size-=1;
    }
    public E getLast(){return es[size-1]; }
    public E get(int position){
        return es[position];
    }
    /*too long time*/
    public void addFirst(E e){
        insert(e,0);
    }
    public void insert(E e,int position){
        if (es.length==size){
            reSize(size*2);
        }
        for (int i=position;i<size;i++){
            es[i+1]=es[i];
        }
        es[position]=e;
        size+=1;
    }
    public AList<E> reverse(){
        E[] res=(E[])new Object[size];
        for(int i=0;i<size;i++){
            res[i]=es[size-1-i];
        }
        return new AList<E>(res);
    }

}
