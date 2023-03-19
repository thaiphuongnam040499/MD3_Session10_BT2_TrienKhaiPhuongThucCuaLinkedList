import java.util.Arrays;

public class LinkedList {
    public static <S> void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>(10);
        list.add(0, "a hiếu");
        list.add(1, "a khiet");
        list.add(2, "Nhân");
        System.out.println(Arrays.asList(list));
        list.addFirst("nam");
        System.out.println(Arrays.asList(list));
        list.addLast("nam");
        System.out.println(Arrays.asList(list));
        list.remove(1);
        System.out.println(Arrays.asList(list));
        list.removeElement("chinh");
        System.out.println(Arrays.asList(list));
        System.out.println("size = "+list.size());
        MyLinkedList<String> cloneList = (MyLinkedList<String>)list.clone();
        System.out.println("array clone==>"+Arrays.asList(cloneList));
//        System.out.println(list.get(1));
        list.getFirst();
        list.getLast();
        list.clear();
        System.out.println(Arrays.asList(list));
    }
}
