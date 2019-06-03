package testdemo;

public class Factorical {
    public int calculate(int inputVal) {
        int outputVal = 1 ;
        if (0 < inputVal && inputVal <= 10) {
            for (int i = 1;i <= inputVal; i++ ){
                outputVal *= i;
            }
        } else {
            outputVal = -1;
        }
        return outputVal;
    }
}
