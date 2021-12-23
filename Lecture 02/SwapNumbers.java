package Lecture;

public class SwapNumbers {
    public static void swap(Integer[] x)
    {
        x[0] = x[0] + x[1];
        x[1] = x[0]-x[1];
        x[0] = x[0]-x[1];
    }
}
