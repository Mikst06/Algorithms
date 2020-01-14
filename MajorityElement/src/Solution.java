/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

        You may assume that the array is non-empty and the majority element always exist in the array.*/

import java.util.*;

public class Solution {
    private int value;
    private int numberOf;

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(map.containsKey(nums[i])){
                map.compute(nums[i],(k,v) -> v + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>len/2){
                return key;
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int[] cos = {6,3,3,6,6,7,7,7,7,7,7,8,1,1,1,1,1,1,1,1,1,1,1,1,1};

        Solution obj = new Solution();

        System.out.println(obj.majorityElement(cos));
    }
}
