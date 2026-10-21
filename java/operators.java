package training.java;

public class operators {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulo: " + mod);


        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);


        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(!(a != b));
    }
}
