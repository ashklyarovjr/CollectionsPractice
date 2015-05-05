import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Timer {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = (LinkedList<Integer>) linkedListInit(1000000);
        List<Integer> arrayList = arrayListInit(1000000);

        linkedListAdd(linkedList);
        arrayListAdd(arrayList);
        System.out.println();
        linkedListRemove(linkedList);
        arrayListRemove(arrayList);
        System.out.println();

    }


    /**
     * Initialisation of linked list
     * @param length - number of elements in the list
     * */
    public static List<Integer> linkedListInit(int length) {

        List<Integer> list = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        long finish = System.nanoTime();
        System.out.println("Linked List init time: " + (finish - start) + " ns");
        return list;
    }


    /**
     * Initialisation of array list
     * @param length - number of elements in the list
     * */
    public static List<Integer> arrayListInit(int length) {

        List<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        long finish = System.nanoTime();
        System.out.println("Array List init time: " + (finish - start) + " ns");
        return list;
    }


    /**
     * Performing "add" operation in the beginning, middle and end of the linked list
     * @param list - performing operations on that list
     * */
    public static void linkedListAdd(LinkedList<Integer> list) {

        long start = System.nanoTime();
        list.addFirst(1);
        long finish = System.nanoTime();
        System.out.println("Add time of first element in linked list: " + (finish - start) + " ns");

        long start1 = System.nanoTime();
        list.add(list.size()/2, 1);
        long finish1 = System.nanoTime();
        System.out.println("Add time of middle element in linked list: " + (finish1 - start1) + " ns");

        long start2 = System.nanoTime();
        list.addLast(1);
        long finish2 = System.nanoTime();
        System.out.println("Add time of last element in linked list: " + (finish2 - start2) + " ns");
    }


    /**
     * Performing "add" operation in the beginning, middle and end of the array list
     * @param list - performing operations on that list
     * */
    public static void arrayListAdd(List<Integer> list) {

        long start = System.nanoTime();
        list.add(0,1);
        long finish = System.nanoTime();
        System.out.println("Add time of first element in array list: " + (finish - start) + " ns");

        long start1 = System.nanoTime();
        list.add(list.size()/2, 1);
        long finish1 = System.nanoTime();
        System.out.println("Add time of middle element in array list: " + (finish1 - start1) + " ns");

        long start2 = System.nanoTime();
        list.add(list.size(), 1);
        long finish2 = System.nanoTime();
        System.out.println("Add time of last element in array list: " + (finish2 - start2) + " ns");

    }


    /**
     * Performing "remove" operation in the beginning, middle and end of the linked list
     * @param list - performing operations on that list
     * */
    public static void linkedListRemove(LinkedList<Integer> list) {

        long start = System.nanoTime();
        list.removeFirst();
        long finish = System.nanoTime();
        System.out.println("Remove time of first element in linked list: " + (finish - start) + " ns");

        long start1 = System.nanoTime();
        list.remove(list.size() / 2);
        long finish1 = System.nanoTime();
        System.out.println("Remove time of middle element in linked list: " + (finish1 - start1) + " ns");

        long start2 = System.nanoTime();
        list.removeLast();
        long finish2 = System.nanoTime();
        System.out.println("Remove time of last element in linked list: " + (finish2 - start2) + " ns");
    }


    /**
     * Performing "remove" operation in the beginning, middle and end of the array list
     * @param list - performing operations on that list
     * */
    public static void arrayListRemove(List<Integer> list) {

        long start = System.nanoTime();
        list.remove(0);
        long finish = System.nanoTime();
        System.out.println("Remove time of first element in array list: " + (finish - start) + " ns");

        long start1 = System.nanoTime();
        list.remove(list.size() / 2);
        long finish1 = System.nanoTime();
        System.out.println("Remove time of middle element in array list: " + (finish1 - start1) + " ns");

        long start2 = System.nanoTime();
        list.remove(list.size() - 1);
        long finish2 = System.nanoTime();
        System.out.println("Remove time of last element in array list: " + (finish2 - start2) + " ns");
    }
}
