


public class ED2Lista1_questao10{

    public int min(int[] array){
        return min(array, 1000000, 0);
    }
    private int min(int[] array, int min, int index) {
        if (index >= array.length) {
            return min;
        }
        if (array[index] < min) {
            min = array[index];
        }
        return min(array, min, index + 1);
    }

}

