
public class JenisLaundry {
    private String jenis;
    private double hargaPerKilogram;
    private int durasi;
    
    public JenisLaundry(String jenis, double hargaPerKilogram){
        this.jenis = jenis;
        this.hargaPerKilogram = hargaPerKilogram;
    }

    public double hitungBiaya(double beratPakaian){
        return hargaPerKilogram * beratPakaian;
    }
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHargaPerKilogram() {
        return hargaPerKilogram;
    }

    public void setHargaPerKilogram(double hargaPerKilogram) {
        this.hargaPerKilogram = hargaPerKilogram;
    }

}

