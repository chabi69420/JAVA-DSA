import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int max = 0;

        for(int candy : candies){
            max = Math.max(max, candy);
        }

        for(int candy : candies){
            if(candy + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}//TC = O(N)
//3Key Logic

//Two main steps:

//Find the maximum candies among all kids - For each kid check candies[i] + extraCandies >= max If yes → true else → false