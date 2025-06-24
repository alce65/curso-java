
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArraysDemo {

    public static int[] foo(int[] data) {
        int[] newData = data.clone();
        newData[0] = 400;
        return newData;

    }

    public static void main(String[] args) {
        int[] data = {1,2,34,5,89};
        int[] data2 = data;
        int[] data3 = {1,2,34,5,89};
        System.out.println(data == data2);
        System.out.println(data == data3); // false

        foo(data3);
        System.out.println(data3);
        System.out.println(data3[0]); // 1


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(5);
        list.add(89);
        System.out.println(list);



    }
}
