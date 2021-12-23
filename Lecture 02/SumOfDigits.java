package Lecture;


public class SumOfDigits {
    public static int getSumOfDigits(int N)
    {
        int sum = 0;
        if (N > 0)
        {
            int i = N;
            while(i != 0)
            {
                sum = sum + i%10;
                i = i/10;
            }
        }
        return sum;
    }
}
