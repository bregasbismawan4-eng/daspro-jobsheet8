import java.util.Scanner;

public class Tugas309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko harus minimal 1.");
        } else {
            int totalSemuaBarang = 0;   // akumulasi barang seluruh toko
            int barangTerbanyak = -1;   // -1 agar toko pertama pasti tercatat
            int tokoTerbanyak = 0;

            int toko = 1;
            while (toko <= jumlahToko) {            // outer loop: toko
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;            // di-reset untuk setiap toko

                for (int p = 1; p <= jumlahPelanggan; p++) {   // inner loop: pelanggan
                    int barang;
                    do {
                        System.out.print("  Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Jumlah barang tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);

                totalSemuaBarang += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {   // ">" agar nomor toko terkecil dipilih saat sama
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }

                toko++;
            }

            System.out.println("==============================");
            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}