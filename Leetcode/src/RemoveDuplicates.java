import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i<len; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }else{
                for(int j = i; j<len-1;j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
                i--;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,5,5,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        for(int i = 0; i<removeDuplicates(arr); i++) {
            System.out.print(arr[i]);
        }
    }

}
