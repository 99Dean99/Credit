public class CreditPaymentService {
    public int calculate(int credit, int creditTerm) {
        // i - percent for 1 mounts;
        // k - annuity ratio
        double percent = 0.0999;
        double i = (percent / 12);
        int mount = creditTerm * 12;
        double a = 1 + i;
        double k = (i * Math.pow(a, mount)/(Math.pow(a, mount) - 1));
        int payment = (int) (k * credit);
        return payment;
    }
}
