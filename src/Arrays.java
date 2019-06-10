public class Arrays {

    // mai multe instante de acelasi tip
    public static void main(String[] args) {
        int x = 10;
        int[] y;    // declarare array
        int z[] = new int[10];
        int[] k = {10, 11, 12};
        y = new int[10];
        int[] w = new int[]{10, 121, 12};
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
        y = new int[10];
        y[0] = 1;
        y[2] = 2;
        System.out.println(y[2]);
        for (int i = 0; i < y.length; i++) {
            y[i] = i;
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
        Angajat[] angajati = new Angajat[10];
        for (int i = 0; i < angajati.length; i++)
        {
            angajati[i] = new Angajat("Angajat " + i);

        }
        for (Angajat X : angajati) {
            System.out.println(X);
            X.setNume("aa");
        }
        for (int i=0; i < angajati.length; i++) {
        if(angajati[i].getNume().equals("AAA")) {
            angajati[i]=new Angajat("BB");
        }
        }
        int [][] arr=new int[4][4];
        int [][][] arr1=new int[2][][];
         arr1[0]=new int[1][1];
         arr1[1]=new int[2][];
         arr1[1][0]=new int[0];
         arr1[1][1]=new int[3];

         for(int i=0;i<arr.length;i++) {
             for (int j=0;j<arr[i].length;j++) {
                 arr[i][j]=i*j;
             }
         }
         for(int[] f :arr) {   /// mai multe dimensiuni
             for (int l :f) {
                 System.out.print(y+ " ");
             }
             System.out.println();


         }

    }
}

