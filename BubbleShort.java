import javax.security.auth.login.LoginContext;

public class BubbleShort {
    public static void main(String[] args) {
        int[] nilai = {99,53,62,14,51,67};
        BubbleShortAscInt(nilai);
        double[] ipk = {2.4, 4.4, 5.0, 3.3};
        BubbleShortAscDouble(ipk);
        String[] nama ={"Nana","Aji","Candra","Budi"};
        BubbleShortAsciString(nama);
    }
    public static void BubbleShortAscInt(int[] bilangan) {
        // tampilan sebelum
        System.out.println("Tipe Data Integer");
        System.out.println("===Sebelum===");
        for (int i : bilangan) {
            System.out.print(i + ", ");
        }

        // logic
        // jangan lupa mengurangi 1 untuk panjang baris agar tidak overvlow
        for(int i = 0; i < bilangan.length; i++) {
            for(int j = 0; j < bilangan.length-1;j++){
                // bila nilai saat ini lebih besar dari nilai bilangan selanjutnya
                if(bilangan[j] > bilangan[j+1]) {
                    // LOGIC TUKAR
                    // pindah bilangan saat ini ke variable tampung sehingga variable saat ini menjadi kosong
                    int tampung = bilangan[j];
                    // isi variable yang kosong dengan index angka selanjutnya,sehingga index angka selanjutnya menjadi kosong
                    bilangan[j] = bilangan[j+1];
                     // kita ubah agar variable tampung menjadi kosong dengan = variable angka[j+1],karena nilai angka[j+1] sebelumnya adalah 0
                    bilangan[j+1] = tampung;
                }
            }
        }

        // tampilan sesudah
        System.out.println("\n===Sesudah===");
        for (int i : bilangan) {
            System.out.print(i + ", ");
        }
    }

    // BubbloShortDouble
    public static void BubbleShortAscDouble(double angka[]){
        // Sebelum
        System.out.println("\n\nTipe Data Double");
        System.out.println("===Sebelum===");
        for (double i : angka) {
            System.out.print(i + ", ");
        }

        // logic
        for(int i = 0; i < angka.length; i++){
            for(int j = 0; j < angka.length-1; j++){
                if(angka[j] > angka[j+1]) {
                    // LOGIC TUKAR
                    // pindah bilangan saat ini ke variable tampung sehingga variable saat ini menjadi kosong
                    double tampung = angka[j];
                    // isi variable yang kosong dengan index angka selanjutnya,sehingga index angka selanjutnya menjadi kosong
                    angka[j] = angka[j+1];
                    // kita ubah agar variable tampung menjadi kosong dengan = variable angka[j+1],karena nilai angka[j+1] sebelumnya adalah 0
                    angka[j+1] = tampung;
                }
            }
        }

        // Sesudah
        System.out.println("\n===Sesudah===");
        for (double i : angka) {
            System.out.print(i + ", ");
        }
    }

    // BubbleShortAsciString
    public static void BubbleShortAsciString(String kata[]){
        // Sebelum
        System.out.println("\nTipe Data String");
        System.out.println("\n===Sebelum===");
        for (String k : kata) {
            System.out.print(k + ", ");
        }

        // logic
        for(int i = 0; i < kata.length; i++){
            for(int j = 0; j < kata.length-1; j++){
                if(kata[j].compareTo(kata[j+1]) > 0) {
                    // LOGIC TUKAR
                    String tampung = kata[j];
                    kata[j] = kata[j+1];
                    kata[j+1] = tampung;
                }
            }
        }

        // Sesudah
        System.out.println("\n===Sesudah===");
        for (String k : kata) {
            System.out.print(k + ", ");
        }
    }

}