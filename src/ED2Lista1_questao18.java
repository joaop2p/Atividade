public class ED2Lista1_questao18 {

  int index;

 

  public ED2Lista1_questao18() {

    index = 0;

  }

 

  public Boolean palindromo(String palavra) {

    return palindromo(palavra, 0, palavra.length() - 1);

  }

 

  private Boolean palindromo(String palavra, int inicio, int fim) {

    if (inicio >= fim) {

      return true;

    }

    if (palavra.charAt(inicio) != palavra.charAt(fim)) {

      return false;

    }

    return palindromo(palavra, inicio + 1, fim - 1);

  }

}