public class CreditPaymentService {
    public double calculate(double a, double b, double c) {
        // a = сумма кредита
        // b = ставка по кредиту
        // c = количество месяцев
        double payment = a * ((b / 12 / 100 * Math.pow((1 + b / 12 / 100), c)) / (Math.pow((1 + b / 12 / 100), c) - 1));
        return payment;
    }
}
