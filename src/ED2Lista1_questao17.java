
  public class ED2Lista1_questao17{

    int index;

    public ED2Lista1_questao17(){

      index = 0;

    }

    public int soma_P(int [] vetor){

      return soma_P(vetor, index, 0);

    }

    private int soma_P(int [] vetor, int index, int sm){

      if (index == 2){

        return sm;

      }

      sm += vetor[index];

      return soma_P(vetor, index+1, sm);

    }

  }