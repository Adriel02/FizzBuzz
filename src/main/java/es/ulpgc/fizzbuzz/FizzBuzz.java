package es.ulpgc.fizzbuzz;

public class FizzBuzz {
    public String of(int n) {
        return fizzbuzz(n).isEmpty() ? String.valueOf(n) : fizzbuzz(n);
    }

    private String fizzbuzz(int n) {
        return fizz(n) + buzz(n);
    }

    private String buzz(int n) {
        return isMultipleOfFive(n) ? "Buzz" : "";
    }

    private String fizz(int n) {
        return isMultipleOfThree(n) ? "Fizz" : "";
    }

    private boolean isMultipleOfFive(int n) {
        return n%5==0;
    }

    private boolean isMultipleOfThree(int n) {
        return n%3==0;
    }
}
