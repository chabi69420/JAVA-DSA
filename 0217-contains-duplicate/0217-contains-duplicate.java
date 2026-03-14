class Solution {
    public boolean containsDuplicate(int[] nums) {
     //Algorithm
//Create a HashSet-Traverse the array-If number already in set → return true
//Otherwise add number to set-If loop finishes → return false 
        //TC = O(1)
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            if(set.contains(num))
                return true;

            set.add(num);
        }

        return false;
    }
}
    
