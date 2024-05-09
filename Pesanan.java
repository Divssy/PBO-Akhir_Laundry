
public class Pesanan {
    private String namaPelanggan;
    private String alamatPelanggan;
    private String nomorTeleponPelanggan;
    private double beratPakaian;
    private double hargaPerKilogram;
    private double totalBiaya;
    private JenisLaundry jenisLaundry; // Deklarasi variabel jenisLaundry
    private Petugas petugas; // Deklarasi variabel petugas

    public Pesanan(String namaPelanggan, String alamatPelanggan, String nomorTeleponPelanggan, double beratPakaian, double hargaPerKilogram, Petugas petugas, JenisLaundry jenisLaundry) {
        this.namaPelanggan = namaPelanggan;
        this.alamatPelanggan = alamatPelanggan;
        this.nomorTeleponPelanggan = nomorTeleponPelanggan;
        this.beratPakaian = beratPakaian;
        this.hargaPerKilogram = hargaPerKilogram;
        this.jenisLaundry = jenisLaundry; // Inisialisasi jenisLaundry
        this.petugas = petugas; // Inisialisasi petugas
        this.totalBiaya = beratPakaian * hargaPerKilogram;
    }

    @Override
    public String toString() {
        return String.format("Pelanggan: %s\nAlamat: %s\nNomor Telepon: %s\nBerat Pakaian: %.2f kg\nJenis Laundry: %s\nHarga per Kilogram: Rp %.2f\nTotal Biaya: Rp %.2f\nPetugas: %s",
                namaPelanggan, alamatPelanggan, nomorTeleponPelanggan, beratPakaian, jenisLaundry.getJenis(), jenisLaundry.getHargaPerKilogram(), jenisLaundry.hitungBiaya(beratPakaian), petugas.getNama());
    }
}


