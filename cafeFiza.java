import java.util.Scanner;

public class cafeFiza {
    static String arrmenu[] = new String[100];
    static String harga[] = new String[100];
    int totalBiaya = 0;

    public static void tambahPesan(Scanner sc){
        System.out.print("Masukkan nama Pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nomer meja: ");
        int nomerMeja = sc.nextInt();

        System.out.println("====== MENU KAFE ======");
        System.out.println("1. Kopi Hitam\t= Rp. 15000");
        System.out.println("2. Latte\t= Rp. 22000");
        System.out.println("3. Teh Tarik\t= Rp. 12000");
        System.out.println("4. Mie Goreng\t= Rp. 18000");
        System.out.println("5. Selesai");

        
        System.out.print("Pilih menu: ");
        int menu = sc.nextInt();
        System.out.println("Masukkan jumlah item untuk " + menu +": ");
        int jumlah = sc.nextInt();

        if (menu == 1) {
            
        }

    }
    public static void main(String[] args) {
        
    }
}
