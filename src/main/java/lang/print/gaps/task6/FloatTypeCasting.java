package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundedNumber = Math.round(numberToBeRounded);
        System.out.println( roundedNumber);
        }
    public static void main(String[] args) {
        FloatTypeCasting ftc = new FloatTypeCasting();
        ftc.roundNumber(3.6f);

    }
}
