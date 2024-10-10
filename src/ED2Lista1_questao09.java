import java.util.ArrayList;
import java.util.List;


public class ED2Lista1_questao09 {
    public String anagramas(String value) {
        List<String> resultados = new ArrayList<>();
        permutar("", value, resultados);
        String anagramas = "";
        for (String s : resultados) {
            anagramas += s;
            anagramas += "\n";
        }
        anagramas = anagramas + "Permutações: " + fatorial(value.toCharArray().length);
        return anagramas;
    }
    private static void permutar(String prefix, String str, List<String> resultados) {
        int n = str.length();
        if (n == 0) {
            resultados.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutar(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), resultados);
            }
        }
    }

    public static int fatorial(int fat){
        return (fat == 1) ? 1:fat * fatorial(fat-1) ;
    }
}
