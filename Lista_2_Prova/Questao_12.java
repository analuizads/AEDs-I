import java.util.Random;
import java.util.Scanner;

public class Questao_12 {

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

    public static void somaVetores(int x[], int y[]){

        int soma[] = new int[x.length];
        int i = 0;

        for(i=0; i<x.length; i++){
            soma[i] = x[i] + y[i];
        }
        
        System.out.print("X + Y = ");
        for(i=0; i<x.length; i++){

            System.out.print(soma[i] + " ");
            
        }
    }

    public static void multiplicaVetores(int x[], int y[]){

        int mult[] = new int[x.length];
        int i = 0;

        for(i=0; i<x.length; i++){
            mult[i] = x[i] * y[i];
        }
        
        System.out.print("\nX * Y = ");
        for(i=0; i<x.length; i++){

            System.out.print(mult[i] + " ");
            
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Entre com o tamanho dos vetores: ");
        n = sc.nextInt();

        int x[] = new int[n];
        int y[] = new int[n];

        x = generateRandomArray(n);
        y = generateRandomArray(n);

        System.out.print("X = ");
        printVetor(x);
        System.out.print("Y = ");
        printVetor(y);

        somaVetores(x, y);
        multiplicaVetores(x, y);

        sc.close();
    }
}
