import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цену");
        double prise = sc.nextDouble();
        System.out.println("Введите колчиество товара");
        int count = sc.nextInt();
        double priceCalculation = priceCalculation(prise, count);
        System.out.println(priceCalculation);
    }

    public static double priceCalculation(double prise, int count) {
        if (prise < 0 | count < 0) {
            return 0;
        } else {
            return prise * count;
        }
    }
}
