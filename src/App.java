import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Instancias
        ED2Lista1_questao01 somatoria = new ED2Lista1_questao01();
        ED2Lista1_questao02 soma = new ED2Lista1_questao02();
        ED2Lista1_questao03 inverter_1 = new ED2Lista1_questao03();
        ED2Lista1_questao04 contar = new ED2Lista1_questao04();
        ED2Lista1_questao05 res = new ED2Lista1_questao05();
        ED2Lista1_questao06 inverter_2 = new ED2Lista1_questao06();
        ED2Lista1_questao09 anagramas = new ED2Lista1_questao09();
        ED2Lista1_questao10 min = new ED2Lista1_questao10();

        Random random = new Random();



        // Entradas
        double[] input = {12.0,32.0,54.7,6.2,8.02,89.0,64.0,64.0,6.0};
        int input2 = 762021192;
        String input3 = "Estruturas de Dados";
        Object[] input4 = {1,2,3,4,5,6,7,8,9};
        int[] input5 = {1,2,3,4,5,6,7,8,9};
        int len = random.nextInt(100);
        int[] input6 = new int[len];

        for(int i = 0; i < input6.length; i++){
            input6[i] = random.nextInt(1000000);
            System.out.print(input6[i]+",");
        }

        // Saídas
        System.out.println(soma.soma_array(input));
        System.out.println(contar.count(0,input2));
        System.out.println(inverter_2.inverter(input3));
        System.out.println(inverter_1.inverter(input4));
        System.out.println(anagramas.anagramas("João"));
        System.out.println(somatoria.soma(5));
        System.out.println(res.mod(5,6));
        System.out.println(min.min(input6));
    }
}