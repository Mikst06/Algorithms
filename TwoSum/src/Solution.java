/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean con = false;
        int[] solution = new int[2];
        for (int i = 0; i <= nums.length - 2; i++) {
            for(int j = i+1; j <= nums.length - 1; j++){
                if (nums[i]+nums[j]==target){
                    solution[0] = i;
                    solution[1] = j;
                    con = true;
                    break;
                }
            }
            if(con){break;}
        }
        return solution;
    }


    public int[] twoSum2(int[] nums, int target) {
        final Map<Integer, Integer> numMap = new HashMap<>();
        final int len = nums.length;
        for (int i = 0; i < len; i++) {
            final int num = nums[i];
            final Integer index = numMap.get(target - num);
            if (index != null) {
                return new int[] {index, i}; //???
            }

            numMap.put(num, i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String args[]){
        int[] arr = {3,2,4};
        int target = 6;
        Solution obj = new Solution();
        int[] sol = obj.twoSum(arr,target);

        System.out.format("[%d,%d]",sol[0],sol[1]);
    }
}