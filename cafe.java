import java.util.Scanner;

public class cafe {
    
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
                    tambahPesanan(sc);;
                    break;
                case 2:
                    tampilPesanan(sc);
                    break;
                case 3:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! silahkan input ulang");
                    break;
            }
        }
    }

    public static void tambahPesanan (Scanner sc) {
        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nomor meja: ");
        int meja = sc.nextInt();

        System.out.println("==== MENU KAFE ====");
        System.out.println("1. Kopi Hitam\t= Rp 15000");
        System.out.println("2. Latte\t= Rp 22000");
        System.out.println("3. Teh Tarik\t= Rp 120000");
        System.out.println("Mie Goreng\t= Rp 18000");

    }

    public static void tampilPesanan (Scanner sc) {

    }
}
