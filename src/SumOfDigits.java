public class SumOfDigits
{
    static int SumofDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return (n % 10 + SumofDigits(n/10));
    }

    public static void main(String[] args)
    {
        int num = 12345;
        int result = SumofDigits(num);
        System.out.println("Sum of digits in " +
                            num + " is " +result);
    }
}
