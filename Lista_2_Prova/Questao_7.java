import java.util.Random;
import java.util.Scanner;

public class Questao_7 {
    
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

    public static void novoVetor(int a[], int b[], int n, int m){

        int newVet[] = new int[n+m];
        int i = 0;
        int j=0;

        for(i=0; i<n+m; i++){

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

        int n, m;

        System.out.print("Entre com o tamanho do vetor a: ");
        n = sc.nextInt();

        
        System.out.print("Entre com o tamanho do vetor b: ");
        m = sc.nextInt();


        int a[] = new int[n];
        int b[] = new int[m];

        a = generateRandomArray(n);
        b = generateRandomArray(m);

        System.out.print("a = "); 
        printVetor(a);
        System.out.print("b = ");
        printVetor(b);


        novoVetor(a, b, n, m);
        
    }
}
