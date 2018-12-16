package lecrure2;


import java.util.*;

// Замерить время добавления, поиска и удаления объектов из коллекции в LinkedList, ArrayList, TreeSet, HashSet
// (использовать большое количество элементов в коллекции, например 100 000).
// Сравнить время и сделать вывод о том, в каких условиях какая коллекция работает быстрее.
public class task1 {

    public static void main (String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> list2 = new TreeSet<>();
        Set<Integer> list3 = new HashSet<>();
        Local Local= new Local();
        System.out.println("\nAdding LinkedList:");
        Local.add(list);
        System.out.println("\nAdding ArrayList:");
        Local.add(list1);
        System.out.println("\nAdding TreeSet:");
        Local.add1(list2);
        System.out.println("\nAdding HashSet:");
        Local.add1(list3);
        System.out.println("\nSearching LinkedList:");
        Local.contains(list);
        System.out.println("\nSearching ArrayList:");
        Local.contains(list1);
        System.out.println("\nSearching TreeSet:");
        Local.contains1(list2);
        System.out.println("\nSearching HashSet:");
        Local.contains1(list3);
        System.out.println("\nRemoving LinkedList:");
        Local.remove(list);
        System.out.println("\nRemoving ArrayList:");
        Local.remove(list1);
        System.out.println("\nRemoving TreeSet:");
        Local.remove1(list2);
        System.out.println("\nRemoving HashSet:");
        Local.remove1(list3);
    }

    static class Local {

        public void add(List<Integer> list) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i <= 10000; i++) {
                list.add(new Integer(i));
            }
            System.out.println((System.currentTimeMillis() - startTime) + " sec.");
        }
        public void add1(Set<Integer> list)
        {
            long startTime = System.currentTimeMillis();
            for (int i=0; i <=10000;i++)
            {
                list.add(new Integer(i));
            }
            System.out.println((System.currentTimeMillis() - startTime) + " sec.");
        }
        public void contains(List<Integer> list) {
            long startTime = System.currentTimeMillis();
            for (int i=0; i <=10000;i++)
            {
                list.contains(new Integer(i));
            }
            System.out.println((System.currentTimeMillis() - startTime) + " sec.");
            }
        public void contains1(Set<Integer> list) {
            long startTime = System.currentTimeMillis();
            for (int i=0; i <=10000;i++)
            {
                list.contains(new Integer(i));
            }
            System.out.println((System.currentTimeMillis() - startTime) + " sec.");
            }
        public void remove(List<Integer> list){
            long startTime = System.currentTimeMillis();
            for (int i=0; i <=10000;i++)
            {
                list.remove(new Integer(i));
            }
            System.out.println((System.currentTimeMillis() - startTime) + " sec.");
            }
        public void remove1(Set<Integer> list){
            long startTime = System.currentTimeMillis();
            for (int i=0; i <=10000;i++)
            {
                list.remove(new Integer(i));
            }
            System.out.println((System.currentTimeMillis() - startTime) + " sec.");
            }
    }
}
