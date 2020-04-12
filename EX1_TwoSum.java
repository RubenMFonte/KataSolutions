public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
        int[] result = new int[2];
    
        for(int i1 = 0; i1 < numbers.length - 1; i1++)
        {
          for(int i2 = i1 + 1; i2 < numbers.length; i2++)
          {
            if(numbers[i1] + numbers[i2] == target)
            {
              result[0] = i1; result[1] = i2;
              return result;
            }
          }
        }
        
        return result;
    }
}
