class code {
    public int calculateSum() {
        int sum = 0;
        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class SumCalculator {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.calculateSum();
        System.out.println("Sum of numbers between 100 and 200 divisible by 7: " + result);
    }
}
