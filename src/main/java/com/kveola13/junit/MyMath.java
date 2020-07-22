package main.java.com.kveola13.junit;

public class MyMath {
    public int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
