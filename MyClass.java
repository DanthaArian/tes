import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil input panjang sisi A dari pengguna
        System.out.print("Masukkan panjang sisi A: ");
        double A = input.nextDouble();

        // Mengambil input panjang sisi B dari pengguna
        System.out.print("Masukkan panjang sisi B: ");
        double B = input.nextDouble();

        // Menghitung panjang sisi C (hipotenusa) menggunakan hukum Pythagoras
        double C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));

        // Menampilkan hasil
        System.out.println("Panjang sisi C (hipotenusa) adalah: " + C);

        input.close();
    }
}
