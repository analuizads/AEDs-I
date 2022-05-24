import java.util.Random;
import java.util.Scanner;

public class Questao_8 {

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

        if(n == m){
        
            for(i=0; i<n; i++) {  
                newVet[j] = a[i];
                j+=2;
            }
        
            j = 1;
                for(i=0; i<n; i++) {  
                newVet[j] = b[i];
                j+=2;
            }
        }
        else if (n>m) {

            for(i=0; i<m; i++) { 
                newVet[j] = a[i];
                j+=2;
            }
            int cont = i;

            for(i = cont; i<n; i++){
                newVet[j] = a[i];
                j++;
            }
        
            j = 1;
            for(i=0; i<m; i++) {  
                newVet[j] = b[i];
             j+=2;
            }
        }
        else {

            for(i=0; i<n; i++) { 
                newVet[j] = a[i];
                j+=2;
            }

            j = 1;
            for(i=0; i<n; i++) {  
                newVet[j] = b[i];
             j+=2;
            }

            int cont = i;
            for(i = cont; i<m; i++){
                newVet[j-1] = b[i];
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
