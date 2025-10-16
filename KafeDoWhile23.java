package daspro_jobsheet7;

import java.util.Scanner;
public class KafeDoWhile23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, hargaKopi = 12000, teh, hargaTeh = 7000, roti, hargaRoti = 20000, totalHarga; 
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Tansaksi dibatalkan. ");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
    
}
