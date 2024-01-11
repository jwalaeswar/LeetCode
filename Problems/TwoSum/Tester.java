package Problems.TwoSum;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Map<int[], Integer> map = new HashMap<>();
        int[] arr1 = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 4};
        int[] arr3 = {3, 3};
        map.put(arr1, 9);
        map.put(arr2, 6);
        map.put(arr3, 6);
        for(Map.Entry<int[], Integer> entry : map.entrySet()){
            int[] arr = Solution.twoSum(entry.getKey(), entry.getValue());
            System.out.printf("[%d, %d]\n", arr[0], arr[1]);
        }
    }
}