public class DRoot {
  public static int digital_root(int n)
  {
    int result = n;
    
    while(result > 9)
    {
      result = n % 10;
      n /= 10;
      
      while(n > 0)
      {
        result += n % 10;
        n /= 10;
      }
      
      n = result;
    }
    
    return result;
  }
}
