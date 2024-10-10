public class ED2Lista1_questao04 {
    int ocorrencias;
    int index;
    String[] array;

    public ED2Lista1_questao04(){
        ocorrencias = 0;
        index = 0;
    }

    public int count(int target, int area){
        array = String.valueOf(area).split("");
        return count(target);
    }


    private int count(int target){
        if (index < array.length){
            if (Integer.parseInt(array[index]) == target){
                ocorrencias ++;
            }
            index ++;
            count(target);
        }
        return ocorrencias;
    }
    
}