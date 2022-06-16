import java.util.Scanner;
public class tugasShorting {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        String[] partKomputer = {"MoBo","CPU","PSU","VGA","RAM","HDD","SSD"};
        int[] harga = {1750000,2500000,900000,7500000,850000,500000,750000};
        int pilihan = 0;
        do {
            System.out.println("\nSilahkan Memilih");
            System.out.println("1. Daftar Komponen Komputer");
            System.out.println("2. Daftar Komponen Komputer bedasarkan harga termurah");
            System.out.println("3. Daftar Komponen Komputer berdasarkan harga termahal");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilihan = inputan.nextInt();
            switch(pilihan) {
                case 1:
                // tampilan menu part Komputer
                    System.out.println("Komponen\tHarga");
                    for(int i= 0;i < partKomputer.length;i++){
                        System.out.println(partKomputer[i]+"\t"+harga[i]);
                    }
                    break;
                case 2:
                // Bubble Short
                    String[] partKomputer2 = partKomputer;
                    int[] harga2 = harga;

                    for(int i = 0;i < partKomputer2.length;i++){
                        for(int j = 0;j < partKomputer.length-1;j++) {
                            if(harga2[j] > harga[j+1]) {
                                // shorting harga
                                int tmp = harga2[j];
                                harga2[j] = harga2[j+1];
                                harga2[j+1] = tmp;
                                // ubah tampilan partKomputer
                                String tmp2 = partKomputer2[j];
                                partKomputer2[j] = partKomputer2[j+1];
                                partKomputer2[j+1] = tmp2;

                            }
                        }
                    }
                    // menampilkan setelah di shorting
                    for(int i= 0;i < partKomputer.length;i++){
                        System.out.println("harga part Komputer berdasarkan harga termurah:");
                        System.out.println(partKomputer2[i]+"\t"+harga2[i]);
                    }
                    break;
                case 3:
                // Selection Short
                    partKomputer2 = partKomputer;
                    harga2 = harga;

                    for(int i = 0;i < partKomputer2.length-1;i++){
                        for(int j = i+1;j < partKomputer2.length;j++){
                            if(harga2[i] < harga2[j]){
                                int tmp = harga2[j];
                                harga2[j] = harga2[i];
                                harga2[i] = tmp;
                                String tmp2 = partKomputer2[j];
                                partKomputer2[j] = partKomputer2[i];
                                partKomputer2[i] = tmp2;
                            }
                        }
                    }

                    System.out.println("harga part Komputer berdasarkan harga termahal:");
                    for(int i= 0;i < partKomputer.length;i++){
                        System.out.println(partKomputer2[i]+"\t"+harga2[i]);
                    }
                    break;
                case 4:
                    System.out.println("Terima Kasih....");
                    break;
            }
        } while (pilihan != 4);
    }
    
}