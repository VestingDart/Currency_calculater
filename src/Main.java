public class Main {
    public static void main(String[] args) {
        Integer money = 10;
        convertToDollars(money);
    }

    public static void convertToDollars(Integer eur) {
        System.out.println("The amount in dollars is: " + eur * 1.09);
    }
}