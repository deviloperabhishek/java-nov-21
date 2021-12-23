package Lecture;

public class ReverseNumber {
    public static int reverseNumber(int num)
    {
        int reverse = 0;
        int j = -1;
        int i = num;
        int placeValue = 1;
        while(i != 0)
        {
            i = i/10;
            j++;

            if(j > 0)
            {
                placeValue = placeValue * 10;
            }
        }

        i = num;

        while(i != 0)
        {
            reverse = reverse + ( i%10)*placeValue;
            i = i/10;
            placeValue = placeValue/10;
        }

        return reverse;
    }
}
