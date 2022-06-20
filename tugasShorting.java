import java.util.Scanner;
public class tugasShorting {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        String[] partKomputer = {"MoBo","CPU","PSU","VGA","RAM","HDD","SSD"};
        int[] harga = {1750000,2500000,900000,7500000,850000,500000,950000};
        int pilihan = 0;
        int ulang = 0;
        do {
            System.out.println("\nSilahkan Memilih");
            System.out.println("1. Daftar Komponen Komputer");
            System.out.println("2. Daftar Komponen Komputer bedasarkan harga termurah");
            System.out.println("3. Daftar Komponen Komputer berdasarkan harga termahal");
            System.out.println("4. Pencarian data barang dan harga");
            System.out.println("5. Keluar");
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
                    BubbleShort(partKomputer,harga);
                    break;
                case 3:
                // Selection Short
                    SelectionShort(partKomputer,harga);
                    break;
                case 4:
                    Sequentialsearch(partKomputer,harga);
                case 5:
                    System.out.println("Terima Kasih....");
                    System.out.println("apakah andan ingin mengulang??");
                    System.out.println("1. YA\n2. TIDAK");
                    ulang = inputan.nextInt();
                    break;
            }
        } while (ulang != 2);
    }
    // BUBBLE SHORT METHOD
    public static void BubbleShort(String partKomputer[],int[] harga) {
        for(int i = 0;i < partKomputer.length;i++){
            for(int j = 0;j < partKomputer.length-1;j++) {
                if(harga[j] > harga[j+1]) {
                    // shorting harga
                    int tmp = harga[j];
                    harga[j] = harga[j+1];
                    harga[j+1] = tmp;
                    // ubah tampilan partKomputer
                    String tmp2 = partKomputer[j];
                    partKomputer[j] = partKomputer[j+1];
                    partKomputer[j+1] = tmp2;

                }
            }
        }
        // menampilkan setelah di shorting
        System.out.println("harga part Komputer berdasarkan harga termurah:");
        for(int i = 0;i < partKomputer.length;i++){
            System.out.println(partKomputer[i]+"\t"+harga[i]);
        }
    }

    // SELECTION SHORT METHOD
    public static void SelectionShort(String partKomputer[],int[] harga) {
        for(int i = 0;i < partKomputer.length-1;i++){
            for(int j = i+1;j < partKomputer.length-1;j++) {
                if(harga[i] < harga[j]) {
                    // shorting harga
                    int tmp = harga[j];
                    harga[j] = harga[i];
                    harga[i] = tmp;
                    // ubah tampilan partKomputer
                    String tmp2 = partKomputer[j];
                    partKomputer[j] = partKomputer[i];
                    partKomputer[i] = tmp2;
                }
            }
        }
        // menampilkan setelah di shorting
        System.out.println("harga part Komputer berdasarkan harga termahal:");
        for(int i = 0;i < partKomputer.length;i++){
            System.out.println(partKomputer[i]+"\t"+harga[i]);
        }
    }

    // Sequential search
    public static void Sequentialsearch(String partkomputer[],int[] harga) {
        Scanner inputan = new Scanner(System.in);
        boolean status = false;
        System.out.println("masukkan nama barang yang ingin di cari");
        String cari = inputan.nextLine();
        // pengecekan barang di dalam array partkomputer
        for(int i = 0;i < partkomputer.length;i++ )
        if(cari.equalsIgnoreCase(partkomputer[i])) {
            System.out.println("anda menginputkan "+cari+"\ndan barang tersebut valid dan memiliki harga Rp."+harga[i]);
            status = true;
            System.out.println("keterangan\n"+ cari + " ditemukan pada posisi ke- "+(i+1) +" dan pada index ke "+ i);
            break;
        }
        if(status == false) {
            System.out.println(cari + " tidak di temukan");
        }
    }
    // ketika data tidak di temukan
}