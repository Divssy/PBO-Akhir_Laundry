public class Transaksi {
    private Client client;
    private Petugas petugas;
    private JenisLaundry jenisLaundry;
    private double beratPakaian;
    private double hargaPerKilogram;

    public Transaksi(Client client, Petugas petugas, JenisLaundry jenisLaundry, double beratPakaian) {
    this.client = client;
    this.petugas = petugas;
    this.jenisLaundry = jenisLaundry;
    this.beratPakaian = beratPakaian;
    this.hargaPerKilogram = jenisLaundry.getHargaPerKilogram();
}

    

    public Client getClient() {
        return client;
    }
    
     public Petugas getPetugas() {
        return petugas;
    }

    public JenisLaundry getJenisLaundry() {
        return jenisLaundry;
    }

    public double getBeratPakaian() {
        return beratPakaian;
    }

    public double getHargaPerKilogram() {
        return hargaPerKilogram;
    }

    public double getTotalBiaya() {
        return beratPakaian * hargaPerKilogram;
    }
}  

