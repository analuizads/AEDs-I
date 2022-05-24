import java.util.Random;
import java.util.Scanner;

public class Questao_6 {

    public static int[] generateRandomArray(int n) {

        Random generator = new Random();
        int vet[] = new int[n];

        for(int j=0; j<n; j++) {

            vet[j] = generator.nextInt(30);
        }

        return vet;

    }

    public static void printVetor(int v[]) {

        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.print("\n");

    }

    public static void novoVetor(int a[], int b[], int n){

        int newVet[] = new int[2*n];
        int i = 0;
        int j=0;

        for(i=0; i<2*n; i++){

            if(i< n){
            newVet[i] = a[i];
            }
            else {
                newVet[i] = b[j];
                j++;
            }
        }
        System.out.println("Novo vetor: ");
        printVetor(newVet);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Entre com o tamanho dos vetores a e b: ");
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        a = generateRandomArray(n);
        b = generateRandomArray(n);

        System.out.print("a = "); 
        printVetor(a);
        System.out.print("b = ");
        printVetor(b);


        novoVetor(a, b, n);
        
    }
}
