
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Pesanan> daftarPesanan = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean selesai = false;

        while (!selesai) {
            System.out.println("Selamat datang di Shark Laundry!");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Semua Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahPesanan();
                    break;
                case 2:
                    tampilkanSemuaPesanan();
                    break;
                case 3:
                    selesai = true;
                    System.out.println("Terima kasih! Telah Menggunakan Jasa Shark Laundry.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void tambahPesanan() {
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan alamat pelanggan: ");
        String alamatPelanggan = scanner.nextLine();
        System.out.print("Masukkan nomor telepon pelanggan: ");
        String nomorTeleponPelanggan = scanner.nextLine();
        System.out.print("Masukkan berat pakaian (kg): ");
        double beratPakaian = scanner.nextDouble();
        System.out.print("Masukkan harga per kilogram: Rp ");
        double hargaPerKilogram = scanner.nextDouble();
        scanner.nextLine(); // untuk membersihkan buffer
        
        System.out.print("Masukkan nama petugas: ");
        String namaPetugas = scanner.nextLine();
        System.out.print("Masukkan jabatan petugas: ");
        String jabatanPetugas = scanner.nextLine();
        System.out.print("Masukkan nomor telepon petugas: ");
        String nomorTeleponPetugas = scanner.nextLine();

        Petugas petugas = new Petugas(namaPetugas, jabatanPetugas, nomorTeleponPetugas);
        JenisLaundry jenisLaundry = new JenisLaundry("cuci setrika", hargaPerKilogram);
        
        Pesanan pesanan = new Pesanan(namaPelanggan, alamatPelanggan, nomorTeleponPelanggan, beratPakaian, hargaPerKilogram, petugas, jenisLaundry);
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan anda berhasil ditambahkan!");
    }

    private static void tampilkanSemuaPesanan() {
        System.out.println("----- Semua Pesanan -----");
        for (Pesanan pesanan : daftarPesanan) {
            System.out.println(pesanan);
        }
        System.out.println("--------------------------");
    }
}



