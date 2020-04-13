public class BouncingBall
{
	
	public static int bouncingBall(double h, double bounce, double window)
  {
	    if(h > 0 && bounce > 0 && bounce < 1 && window < h)
      {
        int result = 1;
        double ballHeight = h * bounce;
        
        while(ballHeight > window)
        {
          result += 2;
          ballHeight *= bounce;
        }
        
        return result;
      }
      else
        return -1;
	}
}
