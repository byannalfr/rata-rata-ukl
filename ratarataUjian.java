package byannalfr;

import java.util.Scanner;

public class ratarataUjian {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        // input jumlah siswa
        System.out.print("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = scanner.nextInt();
        double totalNilai = 0.0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan Nilai Siswa ke "+ i+": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }
        
        // Menghitung rata rata
        double rataRata = totalNilai / jumlahSiswa;
        
        // Hasil rata rata
        System.out.println("Rata Rata Nilai Ujian Adalah : " + rataRata);
        scanner.close();
    }
}

