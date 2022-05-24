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

            vet[j] = generator.nextInt(30);
        }

        return vet;
    }

    public static boolean numeroRepetido(int elemento){



        return false;

    }

    public static void main(String[] args){

        int n = 5;
        int v[] = {1, 1, 1, 4, 3};

        int i = 0, j = 0, cont = 0;

        printVetor(v);

        for(i=0; i<n; i++){
            if(numeroRepetido(v[i])){
                continue;
            }
            for(j=i+1; j<n; j++){
                if(v[i] == v[j]){
                        cont++;
                        break;
                    }
            }

        }

        System.out.print("\n" + cont);

    }    
}
