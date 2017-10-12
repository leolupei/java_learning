import java.util.*;

public class Main {

    public static void main(String[] args) {
        //获取开始时间
        long startTime = System.nanoTime();

        //填充有序但是值不连续的整形数组
        LinkedList list = new LinkedList();
        for (int i = 0; i < 2000; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        //获取结束时间
        long endTime = System.nanoTime();

        System.out.println(String.format("1.总的执行时间：%s纳秒", endTime - startTime));
        System.out.println(String.format("2.数组内容：\n %s",list));
    }
}
