import java.util.Scanner;

public class Tugas209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3.");
        } else {
            int jumlah = 0; // penampung jumlah seluruh angka pada tabel

            for (int i = 1; i <= n; i++) {          // outer loop: baris
                for (int j = 1; j <= n; j++) {      // inner loop: kolom
                    int hasil = i * j;
                    System.out.printf("%4d", hasil); // lebar 4 karakter, rata kanan
                    jumlah += hasil;
                }
                System.out.println();               
            }

            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}