package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String value = String.valueOf(number);
        char [] digits = value.toCharArray();

        int sum = 0;

        for (char digitChar : digits){
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }

        System.out.println(sum);

    }
}
