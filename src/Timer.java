import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Anton_Shkliarov on 4/28/2015.
 */
public class Timer {
    public static void main(String[] args) {
        List<String> linkedList = Arrays.asList("a","v","b","t","ty","w","p","l");
        List<String> list = Arrays.asList("a", "v", "b", "t", "ty", "w", "p", "l");

    }

    public static long linkedListAdd(List list) {
        long start = System.currentTimeMillis();
        


        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long arrayListAdd(List list) {
        long start = System.currentTimeMillis();



        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long linkedListRemove(List list) {
        long start = System.currentTimeMillis();



        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long arrayListRemove(List list) {
        long start = System.currentTimeMillis();



        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
