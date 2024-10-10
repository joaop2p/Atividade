public class ED2Lista1_questao02 {
    protected int index;

    public ED2Lista1_questao02() {
        this.index = 0;
    }

    public double soma_array(double[] array) {
        if (index < array.length){
            return array[index++] + soma_array(array);
        }
        return 0;
    }
}

