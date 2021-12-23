package Lecture;

class Main {
    public static void main(String[] args) {

        //HalfDiamondPattern.printPattern(5);
        //FullDiamondPattern.printPattern(5);

        //int Num = 2564;
        //int sum = SumOfDigits.getSumOfDigits(Num);
        //System.out.println("Sum of digits for: " + Num + " = " + sum );

        // Integer[] a = new Integer[2];
        // a[0] = 7;
        // a[1] = 5;

        // System.out.println("Numbers before swapping a[0] = " + a[0] + ", a[1] = " + a[1]);
        // SwapNumbers.swap(a);
        // System.out.println("Numbers before swapping a[0] = " + a[0] + ", a[1] = " + a[1]);

        int number = 34567;
        System.out.println("Numbers before reversing: " + number);
        number = ReverseNumber.reverseNumber(number);
        System.out.println("Numbers after reversing: " + number);



    }
}