package training.java;

public class typecasting {
    public static void main(String[] args){
        double price = 99.75;
        int amount = (int) price;
        System.out.println(amount);

        char letter = 'A';
        int code = letter;
        System.out.println(code);

        int num = 130;
        byte b = (byte) num;
        System.out.println(b);

        float f = 5.67f;
        long l = (long) f;
        System.out.println(l);
    }
    
}
