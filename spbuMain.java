import java.util.Scanner;

public class spbuMain {
    
    //Class ini berisi fungsi main yang akan dijalankan

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner sc = new Scanner(System.in);
        int pilih;

        //bikin objek antrian dari class linkedListAntrian
        linkedListAntrian antrian = new linkedListAntrian();

        //bikin objek transaksi dari class queueTransaksi
        queueTransaksi transaksi = new queueTransaksi(50);

        //do while menu program beserta pemanggilan tiap method
        do {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Masukkan Plat Nomor : ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan : ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan Merk : ");
                    String merk = sc.nextLine();
                    antrian.tambahAntrian(new kendaraan(plat, jenis, merk));
                }
                case 2 -> antrian.tampilkanAntrian();
                case 3 -> System.out.println(">> Jumlah kendaraan dalam antrian : " + antrian.getSize());
                case 4 -> {
                    kendaraan dilayani = antrian.layaniKendaraan();
                    if (dilayani == null) {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                        break;
                    }
                    System.out.printf("Petugas melayani %s\n", dilayani.platNomor);
                    System.out.print("Masukkan Jenis BBM : ");
                    String bbm = sc.nextLine();
                    System.out.print("Masukkan Harga per liter : ");
                    double harga = sc.nextDouble();
                    System.out.print("Masukkan Jumlah liter : ");
                    int liter = sc.nextInt(); sc.nextLine();
                    transaksi.enqueue(new transaksi(dilayani.platNomor, bbm, harga, liter));
                }
                case 5 -> transaksi.tampilkanTransaksi();
                case 0 -> System.out.println("Keluar.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

    }

}
