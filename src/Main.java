public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int creditTerm = 2;
        int payment = service.calculate(credit, creditTerm);
        System.out.println(payment);
    }
}
