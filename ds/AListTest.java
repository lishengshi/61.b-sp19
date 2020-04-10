public class AListTest {

    public static void main(String[] args) {
        AList<String> list = new AList<>();
        long start = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            list.addLast("李盛世"+i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getLast());
        System.out.println(end-start);
    }
}
