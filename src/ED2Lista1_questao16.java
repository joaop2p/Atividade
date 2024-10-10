public class ED2Lista1_questao16{

    int index;
  
    public ED2Lista1_questao16(){
  
      index = 0;
  
    }
  
    public int Soma_quadrados(int [] vetor){
  
      return soma_quadrados(vetor, index, 0);
  
    }
  
    private int soma_quadrados(int [] vetor, int index, int sm){
  
      if (index == 2){
  
        return sm;
  
      }
  
      sm += vetor[index]*vetor[index];
  
      return soma_quadrados(vetor, index+1, sm);
  
    }
  
  }
  
   