
// Exercicios propostos na aula 48

public class Main {

    public static void main(String[] args) {

        int[] lista = {10, 20, 30, 40, 50};

        // 1 - reverter array
        // print do array
        System.out.print("Array inicial..: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }

        // utilizando auxiliar
        for (int i = 0; i <= (lista.length / 2); i++) {
            int aux = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = aux;
        }
        System.out.println();

        // print do invertido
        System.out.print("Array invertido: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\n");

        // 2 - adicionar elemento a um array
        int elementoAdicionar = 60;

        // novo array maior
        int[] listaAdicionada = new int[lista.length + 1];

        for (int i = 0; i < lista.length; i++) {
            listaAdicionada[i] = lista[i];

            // antes de terminar o loop, adiciona
            // poderia só ter feito depois do loop..
            if (i == lista.length - 1) {
                listaAdicionada[i + 1] = elementoAdicionar;
            }
        }

        // mostrando array com adicao
        System.out.println("Array adicionou o elemento " + elementoAdicionar + "...");
        for (int i = 0; i < listaAdicionada.length; i++) {
            System.out.print(listaAdicionada[i] + " ");
        }
        System.out.println("\n");

        // 3 - excluir elemento de um array
        int elementoExcluir = 30;

        // criando array menorr
        int[] listaRemovida = new int[lista.length - 1];

        // auxiliar nao iterar no i
        // e passar do tamanho do array menor
        int auxRemover = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != elementoExcluir) {
                listaRemovida[auxRemover] = lista[i];
                auxRemover++;
            }
        }

        // print do array pos-remover
        System.out.println("Array removeu o elemento " + elementoExcluir + "...");
        for (int i = 0; i < listaRemovida.length; i++) {
            System.out.print(listaRemovida[i] + " ");
        }
        System.out.println("\n");

        // 4 - pesquisar elemento em um array
        int elementoPesquisar = 20;

        System.out.println("Procurando o elemento " + elementoPesquisar + " na lista...");
        for (int i = 0; i < lista.length; i++) {
            if (elementoPesquisar == lista[i]) {
                System.out.println("Elemento encontrado!");
                System.out.println("O elemento " + elementoPesquisar + " está no index " + i);
                break;
            }

            // já que não é função, precisa disso
            // pra antes de terminar o loop ele checa se achou
            if (i == lista.length - 1) {
                System.out.println("Elemento não está na lista!");
            }
        }
        System.out.println();



        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 5 - somar diagonal principal e secundaria
        // print matriz inicial
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagonalPrincipal += matriz[i][j];
                }

                // vi que só mudei a "passei pro outro lado"
                // quando comparado com o que fizeram na aula
                if (j + 1 == (matriz[i].length - i)) {
                    diagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: "+ diagonalPrincipal);
        System.out.println("Soma da diagonal secundaria: "+ diagonalSecundaria);
        System.out.println();

        // 6 - rotacionando a matriz
        int[][] matrizRotacionada = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // confesso que nao consegui pensar na logica sozinho..
                // inverti o i e o j e ela rotacionou pra traz
                matrizRotacionada[matriz.length - 1 - i][j] = matriz[j][i];
            }
        }

        // print matriz rotacionada
        System.out.println("Matriz rotacionada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matrizRotacionada[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();

        // 7 - pesquisar elemento em uma matriz
        // e todas as vezes que aparece
        int matrizProcurar = 3;
        int contagem = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == matrizProcurar){
                    contagem++;
                }
            }
        }

        if (contagem > 0){
            System.out.println("O elemento "+ matrizProcurar +" foi encontrado!");
            System.out.println("Encontrado "+ contagem +" vezes");
        } else {
            System.out.println("O elemento "+ matrizProcurar +" não foi encontrado na matriz...");
        }
    }
}