public class ED2Lista1_questao05 {
    public int mod(int x, int y) {
        if (x < y) {
            return x;
        } else if (x == y) {
            return 0;
        } else {
            return mod(x - y, y);
        }
    }
}
