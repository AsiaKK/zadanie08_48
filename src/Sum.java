public class Sum {


    public static int getCountReturnSum(int number) {
        int sum = 0;
        int workingNumber = number;

        while (workingNumber != 0) {
            sum += workingNumber % 10;
            workingNumber = workingNumber / 10;
        }
        return sum;
    }
}