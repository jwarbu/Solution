import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

class Solution {
    public static int singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> holder = new HashMap();
        int loop = nums.length;
        for(int i = 0; i<loop; i++)
        {
            if(holder.containsKey(nums[i]))
            {
                holder.remove(nums[i]);
            }
            else
            {
                holder.put(nums[i],nums[i]);
            }
        }

        Set keys = holder.keySet();
        Integer[] answer = (Integer[])keys.toArray();
        System.out.println(answer[0]);
        return 0;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,1,3,5,4,2,4};
        singleNumber(nums);
    }
}