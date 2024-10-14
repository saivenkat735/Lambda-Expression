import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Operation add3=new Addition();
        System.out.println(add3.operate(4, 5));

        Operation product3=new Multiplication();
        System.out.println(product3.operate(3, 7));

        System.out.println("---------------------------------");





        //2nd way - Anonymous class
        Operation add1=new Operation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }};
        System.out.println(add1.operate(4,5));


        Operation product1=new Operation() {
            @Override
            public int operate(int a, int b) {
                return a*b;
            }};
        System.out.println(product1.operate(3,7));
        System.out.println("--------------------------------");


        //Third way -lambda expression
        Operation add2=(a,b)->a+b;
        System.out.println(add2.operate(4,5));

        Operation product2=(a, b)->a*b;
        System.out.println(product2.operate(3,7));


        System.out.println("--------------------------------");
        //4th way - base functional interface - supplier, consumer, predicate, function

        BiFunction<Integer, Integer, Integer> add4=(a, b)->a+b;
        System.out.println(add4.apply(4,5));

        BiFunction<Integer, Integer, Integer> product4=(a, b)->a*b;
        System.out.println(product4.apply(3, 7));




    }
}