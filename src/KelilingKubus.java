import java.util.Scanner;

public class KelilingKubus {

    /**
     * Method utama untuk menghitung keliling kubus berdasarkan sisi yang dimasukkan.
     * Program akan meminta input sisi kubus dari pengguna dan menghitung kelilingnya.
     * Hasil keliling kubus akan ditampilkan di layar.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Keliling Kubus");
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        double keliling = hitungKelilingKubus(sisi);

        System.out.println("Keliling kubus dengan panjang sisi " + sisi + " adalah: " + keliling);
    }

    /**
     * Method untuk menghitung keliling kubus berdasarkan panjang sisi yang diberikan.
     *
     * @param sisi Panjang sisi kubus yang akan digunakan untuk menghitung keliling.
     * @return Keliling kubus sesuai dengan panjang sisi yang diberikan.
     */
    public static double hitungKelilingKubus(double sisi) {
        return 12 * sisi;
    }
}
