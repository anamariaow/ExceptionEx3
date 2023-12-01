public class Main {
    public static void main(String[] args) {
        System.out.println(numDividedByZero(2));
    }

    public static int numDividedByZero(int num) {
        try {
            int risultato = num / 0;
            System.out.println("Risultato:" + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Impossibile dividere per 0: num" + e.getMessage() + " =");
        }
        return 0;
    }
}