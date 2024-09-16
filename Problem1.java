public class Problem1
{
  public static void main(String[] args)
  {
    // double x = 5 / 20;
    // System.out.println(x);
    ////// this prints 0.0 not 0.25 bc int int int even if you declare variable as a double

    double numerator = 5;
    int denominator = 20;
    System.out.println(numerator / denominator);

    // or

    double x = (double) 5 / 20; //type cast 5 as a double
    System.out.println(x);
  }
}
