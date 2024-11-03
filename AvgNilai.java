package pert6;
 import java.util.Scanner;

public class AvgNilai {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahMahasiswa;

        System.out.printf("Maka, rata-rata nilainya adalah: %.2f%n", rataRata);
        System.out.println("Developed by: Intan Komalasari");
    }
}


