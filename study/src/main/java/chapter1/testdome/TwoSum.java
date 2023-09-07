package chapter1.testdome;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.length; i++) {
            int target = sum - list[i];
            if (map.containsKey(target)) {
                return new int[]{i, map.get(target)};
            }
            map.put(list[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{3, 1, 5, 7, 5, 9}, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}