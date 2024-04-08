public class Client implements ProsesTransaksi {
    private String nama;
    private String alamat;
    private String telepon;
    private int saldo;

    public Client(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.saldo = 0;
    }

    
    @Override
public void cuci(JenisLaundry jenisLaundry, Petugas petugas, int beratPakaian) {
    double totalBiaya = jenisLaundry.hitungBiaya((int) beratPakaian);
    if (saldo >= totalBiaya) {
        saldo -= totalBiaya;
        Transaksi transaksi = new Transaksi(this, petugas, jenisLaundry, beratPakaian);
        LaundrySistem.tambahTransaksi(transaksi);
        System.out.println("Transaksi berhasil!");
    } else {
        System.out.println("Saldo tidak mencukupi!");
    }
}


    @Override
    public void topUpSaldo(int jumlah) {
        saldo+= jumlah;
        System.out.println("Saldo bertambah"+jumlah);
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
