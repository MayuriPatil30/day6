import java.security.SecureRandomSpi;
import java.util.Random;

public class Randomcoupon
{
       public static void main(String[] args) 
      {
          Random Number = new Random();
          int CouponNumber = Number.nextInt(10000);
          int CouponNumber2 = Number.nextInt(1000);
          System.out.println(CouponNumber + "UseIT" + CouponNumber2);
    }
}