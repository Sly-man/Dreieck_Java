package day03;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9,
                143, 4, 7, 8, 2));

        ArrayList<Integer> nums = new ArrayList<>(base);
        //Lambda Expression ->
        nums.removeIf( e -> e % 2 == 0); // n is a variable to define every element
        //sart saglananlari remove eder
        System.out.println(nums);//[5, 9, 143, 7]

        ArrayList<Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf( each -> each > 10);//[4, 6, 2, 5, 9, 4, 7, 8, 2]
        System.out.println(nums2);
        //ArrayList<String> days = ArrayListWithMethods.getDaysOfWeek();
        //days.removeIf( day -> day.startsWith("S") || day.startsWith("T"));
        //System.out.println(days);
    }
}
