public class ED2Lista1_questao03 {
    String primeiro;
    int start;
    String ultimo;
    
    public ED2Lista1_questao03(){
        start = 0;
    }

    public String inverter(Object[] input){
        Object[] result = inverter(input, 0, input.length - 1);
        StringBuilder saida = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            saida.append(String.valueOf(result[i]));
        }
        return saida.toString();
    }
    private Object[] inverter(Object[] array, int start, int end) {
        if (start >= end) {
            return array;
        }
        Object temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        return inverter(array, start + 1, end - 1);
    }
}
