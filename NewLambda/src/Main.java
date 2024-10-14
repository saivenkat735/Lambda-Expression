import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isOdd = x -> x % 2 == 0;
        IntFunction<String> isEven = x -> (x % 2 == 0) ? "Even" : "Odd";
        BiFunction<Integer,Integer,Double> power = (base,exp) -> Math.pow(base,exp);
        Predicate<String> isPalindrome = str -> str.equals(new StringBuilder(str).reverse().toString());

        int num = 7;
        System.out.println(num + " is " + isEven.apply(num));

        int num2 = 8;
        System.out.println(num2 + " is " + (isOdd.test(num2) ? "Even" : "Odd"));


        int base=2;
        int exp=3;
        System.out.println(base + " raised to the power of " + exp + " is " + power.apply(base, exp));

        String str = "racecar";
        System.out.println(str + " is " + isPalindrome.test(str));

    }
}