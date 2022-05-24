import java.util.Random;
import java.util.Scanner;

public class Questao_5 {

    public static void printVetor(int v[]) {

        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.print("\n");

    }

    public static int[] generateRandomArray(int n) {

        Random generator = new Random();
        int vet[] = new int[n];

        for(int j=0; j<n; j++) {

            vet[j] = generator.nextInt(20);
        }

        return vet;
    }

    public static boolean numeroRepetido(int elemento, int vetAux[]){

        int i = 0;

        for(i=0; i<vetAux.length; i++){

            if(elemento == vetAux[i]){
                return true;
            }

        }
        return false;
    }

    public static int[] adicionaElemento(int vetAux[], int elemento){

        int i = 0;

        for(i=0; i<vetAux.length; i++){
            if(elemento == vetAux[i]){
                return vetAux;
            }
        }

        for(i=0; i<vetAux.length; i++){
            if(vetAux[i] == -1){
                vetAux[i] = elemento;
            }   
        }
        return vetAux;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Entre com o tamanho do vetor: ");
        n = sc.nextInt();

        int v[] = new int[n];
        int vetAux[] = new int[n];
        int i = 0, j = 0, cont = 0;
        int elemento;

        v = generateRandomArray(n);
        
        for(i=0; i<vetAux.length; i++){
            vetAux[i] = -1;
        }

        printVetor(v);

        for(i=0; i<n; i++){
            elemento = v[i];
            if(numeroRepetido(elemento, vetAux)){
                continue;
            }
            vetAux = adicionaElemento(vetAux, elemento);
            for(j=i+1; j<n; j++){
                if(v[i] == v[j]){
                        cont++;
                        break;
                    }
            }

        }

        System.out.print("Quantidade de números duplicados: " + cont);

    }    
}
