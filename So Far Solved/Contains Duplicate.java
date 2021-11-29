// 217. Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Input: nums = [1,2,3,1]
// Output: true

// Input: nums = [1,2,3,4]
// Output: false

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i:nums){
            if(!set.add(i)) return true;
        }
        
        return false;
    }
}