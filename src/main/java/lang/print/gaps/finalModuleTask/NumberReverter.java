package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }
        System.out.println(reversedNumber);
    }
}