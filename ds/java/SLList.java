public class SLList<E> {

    private class Node{
        private E item;
        private Node next;
        public Node(E e,Node next){
            this.item=e;
            this.next=next;
        }
    }

    private Node first;
    private int size;
    private Node last;



    public SLList(E e){
        this.first = new Node(e,null);
        this.last = new Node(e,null);
        size = size+1;
    }
    public SLList(E[] es){
        this(es[0]);
        for (int i=1;i<es.length;i++){
            this.addLast(es[i]);
        }

    }
    public void addLast(E e){
        size+=1;
        if(this.first==null){
            first=new Node(e,null);
            last=new Node(e,null);
        }
        Node p=first;
        while (p.next!=null){
            p=p.next;
        }
        last=p.next=new Node(e,null);
    }
    public void addFirst(E e){
        size+=1;
        if(this.first==null){
            first=new Node(e,null);
            last=new Node(e,null);
        }
        Node node=new Node(e,first);
        first=node;
    }
    public int size(){
        return size;
    }
    public E getFirst(){
        return first.item;
    }
    public E getLast(){
        return last.item;
    }
    public void insert(E e,int position){
        size+=1;
        if(this.first==null){
            first=new Node(e,null);
            last=new Node(e,null);
        }
        if (size<position){
            addLast(e);
        }else{
            //定义一个虚节点
            Node p=new Node(e,first);
            int count=0;
            while(count<position){
                p=p.next;
                count++;
            }
            Node res=p.next;
            p.next=new Node(e,res);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("SLList{");
        Node p=first;
        while (p!=null){
            s.append(p.item.toString()+",");
            p=p.next;
        }
        return s.append("}").toString();
    }
}
