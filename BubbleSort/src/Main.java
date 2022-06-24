public class Main {

    public static void main(String[] args) {

        int vetor[] = {3,6,2,1,8,4,9,7,10,5};
        int aux;
        boolean controle;

        System.out.println("Vetor antes do BUBBLE SORT:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (int j = 0; j < (vetor.length -1); j++) {
                if (vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+ 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }

            }
            if (controle){
                break;
            }
        }

        System.out.println("Vetor apos o BUBBLE SORT:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
