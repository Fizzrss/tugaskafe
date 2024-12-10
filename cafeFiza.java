import java.util.Scanner;

public class cafeFiza {
    static String arrmenu[] = new String[100];
    static String harga[] = new String[100];
    static int totalBiaya = 0;

    public static void tambahPesan(Scanner sc){
        System.out.print("Masukkan nama Pelanggan: ");
        String nama = sc.nextLine();
        sc.next();
        System.out.print("Masukkan nomer meja: ");
        int nomerMeja = sc.nextInt();

        System.out.println("====== MENU KAFE ======");
        System.out.println("1. Kopi Hitam\t= Rp. 15000");
        System.out.println("2. Latte\t= Rp. 22000");
        System.out.println("3. Teh Tarik\t= Rp. 12000");
        System.out.println("4. Mie Goreng\t= Rp. 18000");
        
        for (int i = 0; i < arrmenu.length; i++) {
            
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            
            String namaMenu = "";
            int harga;
            if (menu == 1) {
                namaMenu = "Kopi Hitam";
                harga = 15000;
            } else if (menu == 2) {
                namaMenu = "Latte";
                harga = 22000;
            } else if (menu == 3) {
                namaMenu = "Teh tarik";
                harga = 12000;
            } else if (menu == 4) {
                namaMenu = "Mie Goreng";
                harga = 18000;
            } else {
                System.out.println("Pesanan Berhasil ditambahkan");
                break;
            }
            System.out.print("Masukkan jumlah item untuk " + namaMenu + ": ");
            int jumlah = sc.nextInt();
            harga *= jumlah;
            totalBiaya += harga;
        }
        System.out.println("Total harga pesanan = " + totalBiaya);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        while (true) {
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
        }
    }
}
