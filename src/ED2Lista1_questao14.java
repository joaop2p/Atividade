public class ED2Lista1_questao14{
    public class Nodo {
      Object valor;
      Nodo proximo;
  
      public Nodo(){
        this.valor = null;
        this.proximo = null;
      }
    }
  
    public class passageiros{
      public class basic_info{
        String Nome;
        String CPF;
        String Telefone;
  
      public basic_info(){
        Nome = null;
        CPF = null;
        Telefone = null;
      }
    }
  
    public class lista_passageiros{
      Nodo primeiro;
      Nodo ultimo;
      int tamanho;
  
      public lista_passageiros(){
        primeiro = null;
        ultimo = null;
        tamanho = 0;
      }
  
      public void inserir(passageiros passageiro){
        Nodo novo = new Nodo();
        novo.valor = passageiro;
        if (primeiro == null){
          primeiro = novo;
  
          ultimo = novo;
        }
        else{
          ultimo.proximo = novo;
          ultimo = novo;
        }
        tamanho++;
      }
    }
  }}