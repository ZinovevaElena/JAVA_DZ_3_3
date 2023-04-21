public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Аннуитетный ежемесячный платеж по кредиту в размере 1 млн руб на 1 год составит:");
        System.out.println(service.calculate(1_000_000, 9.99, 12));
        System.out.println("Аннуитетный ежемесячный платеж по кредиту в размере 1 млн руб на 2 года составит:");
        System.out.println(service.calculate(1_000_000, 9.99, 24));
        System.out.println("Аннуитетный ежемесячный платеж по кредиту в размере 1 млн руб на 3 года составит:");
        System.out.println(service.calculate(1_000_000, 9.99, 36));
    }
}
