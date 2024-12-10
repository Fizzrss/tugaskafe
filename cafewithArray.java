import java.util.Scanner;

public class cafewithArray {
    static String listMenu[][] = {
        {"Kopi Hitam", "15000"},
        {"Latte", "22000"},
        {"Teh Tarik", "12000"},
        {"Mie Goreng", "18000"}
    };
    static String daftarPelanggaan[] = new String[1000];
    static int nomerMeja[] = new int[1000];
    static int biayaPelanggan[] = new int[1000];
    static int jmlPelanggan = 0;

    public static void tambahPesan(Scanner sc){
        int totalBiaya = 0;

        System.out.print("Masukkan nama Pelanggan: ");
        String nama = sc.nextLine();
        sc.next();
        System.out.print("Masukkan nomer meja: ");
        int meja = sc.nextInt();

        daftarPelanggaan[jmlPelanggan] = nama;
        nomerMeja[jmlPelanggan] = meja;

        System.out.println("========= MENU KAFE =========");
        System.out.printf("%-5s %-20s %-10s\n", "No.", "Nama Menu", "Harga");
        for (int i = 0; i < listMenu.length; i++) {
            System.out.printf("%-5s %-20s %-10s\n", (i+1), listMenu[i][0], listMenu[i][1]);
        }
        
        while (true) {
            
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            
            if (menu == 0) {
                System.out.println("Pesanan berhasil ditambahkan!");
                break;
            } else if (menu < 1 || menu > listMenu.length) {
                System.out.println("Maaf menu tidak ada di daftar! Silahkan input ulang!");
                continue;
            } 

            String namaMenu = listMenu[menu-1][0];
            int harga = Integer.parseInt(listMenu[menu-1][1]);

            System.out.print("Masukkan jumlah item untuk " + namaMenu + ": ");
            int jumlah = sc.nextInt();

            totalBiaya += harga * jumlah;
        }
        biayaPelanggan[jmlPelanggan] = totalBiaya;
        jmlPelanggan++;
        System.out.println("Total harga pesanan = " + totalBiaya);         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=== MENU KAFE ===");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tambahPesan(sc);
                    break;
                case 2:
                    // tampilPesanan(sc);
                    break;
                case 3:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! silahkan input ulang");
                    continue;
            } 
        } while (pilihan != 3);
    }
}
