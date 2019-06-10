import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului: ");
        int n=scanner.nextInt();
        int[] array=new int[n];
        System.out.println("Introduceti elementele array-ului");
        for (int i=0; i<n;i++) {
            System.out.println("Introduceti elementul "+i);
            array[i]=scanner.nextInt();
        }
        System.out.println("afisam array-ul");
        for (int x:array) {
            System.out.print(x+ " ");
        }

        System.out.println("number to be checked");   /// verificam daca un numar contine un array sau nu
        int number=scanner.nextInt();
        boolean flag=false;
        int pozitie=0;
        for (int x:array) {
            if (x == number) {
                flag = true;
                break;
            }
            pozitie++;
        }
        if(flag) {
            System.out.println("Array contine numarul "+number+" pe pozitia "+pozitie);
        } else  {
            System.out.println("Array-ul nu contine numarul "+ number);
        }
    }
}
