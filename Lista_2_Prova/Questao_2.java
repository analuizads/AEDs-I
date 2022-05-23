import java.util.Scanner;
import java.util.Random;

public class Questao_2 {

    public static void printArray(int v[]) {

        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.print("\n");

    }

    public static int[] generateRandomArray(int size, int range) {

        Random generator = new Random();
        int vet[] = new int[size];

        for(int j=0; j<vet.length; j++) {

            vet[j] = generator.nextInt(range);
        }

        return vet;
    }    

    public static void pairNumbers(int v[], int i){

        if(v[i]%2 == 0){
            System.out.println(v[i]);
        }
        if(i < v.length - 1){
            pairNumbers(v, i+1);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Entre com o tamanho do vetor: ");
        size = sc.nextInt();

        int v[] = new int[size];
        int range = 50;
        int i = 0;

        v = generateRandomArray(size, range);

        printArray(v);
        
        pairNumbers(v, i);
        
        sc.close();
    }
    
}
