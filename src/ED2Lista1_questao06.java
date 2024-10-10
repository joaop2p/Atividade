public class ED2Lista1_questao06 {
    char[] split_input;
    char[] split_output;
    String primeiro;
    int start;
    String ultimo;
    
    public ED2Lista1_questao06(){
        start = 0;
    }

    public String inverter(String input){
        char [] saida_temp = input.toCharArray();
        String[] saida = new String[saida_temp.length];
        for (int i = 0; i < saida_temp.length; i++) {
            saida[i] = String.valueOf(saida_temp[i]);
        }
        return String.join("",inverter(saida, 0, saida.length - 1));
    }
    private String[] inverter(String[] array, int start, int end) {
        if (start >= end) {
            return array;
        }
        String temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        return inverter(array, start + 1, end - 1);
    }
}
