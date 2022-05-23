import java.util.Scanner;

public class Questao_3 {

    public static void printVetor(int v[]) {

        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.print("\n");

    }

    public static int[] ordenarVetor(int v[], int n){
        int i = 0, j = 0;
        int aux;

        for(i=0; i<n; i++){
            for(j=i + 1; j<n; j++) {
                if(v[i] > v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }

        return v;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Entre com o tamanho do vetor: ");
        n = sc.nextInt();

        int v[] = new int[n];

        for(int i=0; i<v.length; i++){

            System.out.print("Entre com um número: ");
            v[i] = sc.nextInt();

        }

        printVetor(v);

        v = ordenarVetor(v, n);

        System.out.print("O segundo maior número é " + v[v.length-2]);

        sc.close();
    }
    
}
