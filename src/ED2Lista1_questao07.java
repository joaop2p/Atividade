public class ED2Lista1_questao07 {

    public class No {
        No proximo;
        Object value;

        public No(){
            proximo = null;
            value = null;
        }
    }
    public class Lista {
        No ultimo;
        int tamanho;
        No primeiro;

        public Lista(){
            ultimo = null;
            primeiro = null;
            tamanho = 0;
        }

        public void append(Object value){
            No no = new No();
            no.value = value;
            no.proximo = null;
            if (tamanho == 0){
                ultimo = no;
                primeiro = no;
            }else{
                ultimo.proximo = no;
                ultimo = no;
            }
            tamanho ++;
        }

        public int count(){
            return count(1, primeiro);
          }
        
        private int count(int quant, No no){
            if(no.proximo != null){
              quant++;
              return count(quant, no.proximo);
            } else{
              return quant;
            }
        
          }

    }

}