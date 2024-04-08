
public class Petugas {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String jabatan;
    
    public Petugas(){
        
    }
    
    public Petugas(String nama, String jabatan, String nomorTelepon){
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.jabatan = jabatan;
    }

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
        return nomorTelepon;
    }

    public void setTelepon(String telepon) {
        this.nomorTelepon = telepon;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
