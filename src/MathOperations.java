public class MathOperations {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;
        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int divideResult = firstNumber / secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Summa:" + sumResult);
        System.out.println("Atņemšanas rezultāts:" + subtractResult);
        System.out.println("Dalīšanā rezultāts:" + divideResult);
        System.out.println("Reizināšanas rezultāts:" + multiplyResult);
        double a = Math.random() * 200 - 100;
        System.out.println(a);
    }
}
