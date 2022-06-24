//ALUNO: João Vitor Perin
//Algoritmos de ordenação - Bubble Sort

public class Main {

    public static void main(String[] args) {

        int vetor[] = {3,6,2,1,8,4,9,7,10,5};

        //variável que vai armazenar temporariamente o valor a ser "movido"
        int x;

        //variável para evitar que mesmo que o vetor esteja ordenado, o laço
        //de repetição continue ordenando "nada"
        boolean controle;

        //imprime o vetor antes do Bubble Sort
        System.out.println("Vetor antes do BUBBLE SORT:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //dois laços de repetição para executar o Bubble Sort:
        //um para o verificar garantir que o segundo laço seja executado pelo menos
        //o mesmo numero de vezes que o tamanho do vetor (a nao ser q a variável controle interrompa)
        //e outro para verificar os dois index (comparar numero A com numero B)

        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (int j = 0; j < (vetor.length -1); j++) {
                if (vetor[j] > vetor[j + 1]){
                    x = vetor[j];
                    vetor[j] = vetor[j+ 1];
                    vetor[j + 1] = x;
                    //define a variavel controle como false, garantindo
                    //que o algoritmo continue testando as próximas posições
                    controle = false;
                }

            }
            //se a variável controle for "true" quer dizer que o algoritmo não
            //entrou no segundo laço de repetição, ou seja, o vetor já está ordenado
            if (controle){
                break;
            }
        }

        //imprime o vetor depois do Bubble Sort
        System.out.println("Vetor apos o BUBBLE SORT:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
