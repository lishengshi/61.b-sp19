public class SLListTest {
    public static void main(String[] args) {
        SLList<String> slList = new SLList<>(new String[]{"李盛世","徐涣","黄龙"});
        slList.addFirst("铁手");
        slList.addLast("叶问");
        System.out.println(slList.getFirst()+"  last:"+slList.getLast());
        slList.insert("白起",3);
        System.out.println(slList);

    }
}
