public class Problem3
{
 public static void main(String[] args)
 {
   double num = 67.3424;
   System.out.println ("decimal number: " + num);
   num = num * 1000;  //makes # 67342.4

   int digit3 = (int) num % 10; //divides by 10, gives last digit as remainder = 2.4 rounds to 2
   num = num / 10;              //gets 6734
   int digit2 = (int) num % 10; 
   num = num / 10;
   int digit1 = (int) num % 10;
   num = num / 10;

   System.out.println("Answer: " + digit1 + " " + digit2 + " " + digit3);
 }
} 
