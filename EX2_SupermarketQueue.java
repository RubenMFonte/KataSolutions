import java.util.Arrays;
public class Solution
{

    public static int solveSuperMarketQueue(int[] customers, int n)
    {
      int[] ills = new int[n];
      
      for(int i = 0; i < customers.length; i++)
      {
        ills[0] += customers[i];
        
        Arrays.sort(ills);
      }
      
      return ills[ills.length-1];
      
    }
    
}
