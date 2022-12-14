package Lista06;

public class atividade03 {
    public static void main(String[] args) {

        String nomes[] = {"André, Bruna, Carlos, Duda, Eduardo"};
        int idade[] = {12, 30, 25, 18, 14};
        int maior = 0, menor = Integer.MAX_VALUE;


        for(int i = 0; i < idade.length; i++){
            if(idade[i] > maior){
                maior = idade[i];
            }
        }
        for (int j = 0; j < idade.length; j++) {
            if(idade[j] < menor){
                menor = idade[j];
            }
        }
        System.out.println("Mais Velho é: "+ maior);
        System.out.println("Mais Novo é = "+ menor);
    }
}
