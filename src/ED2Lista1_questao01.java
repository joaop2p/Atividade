public class ED2Lista1_questao01 {
    public double soma(int n) {
        return _soma(n);
    }

    private double _soma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1.0 / n + _soma(n - 1);
        }
    }}