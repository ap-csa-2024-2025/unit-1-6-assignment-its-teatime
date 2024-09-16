public class Problem2
{
 public static void main(String[] args)
 {
   double num1 = 57.3934;
   double num2 = 22.5211;
   System.out.println ("Two original numbers:");
   System.out.println (num1);
   System.out.println (num2);

   int roundedNum1 = (int) (num1 + 0.5);
   int roundedNum2 = (int) (num2 + 0.5);
   System.out.println ("Answer: " + roundedNum1 + " + " + roundedNum2 + " = " + (roundedNum1 + roundedNum2));

 }
} 
