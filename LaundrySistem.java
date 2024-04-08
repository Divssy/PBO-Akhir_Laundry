import java.util.ArrayList;
import java.util.List;


public class LaundrySistem {
    private static List<Client> daftarClient = new ArrayList<>();
    private static List<JenisLaundry> daftarJenisLaundry = new ArrayList<>();
    private static List<Transaksi> daftarTransaksi = new ArrayList<>();
    private static List<Petugas> daftarPetugas = new ArrayList<>();
  
    
    public static void tambahClient(Client client){
        daftarClient.add(client);
    }
    public static void tambahJenisLaundry(Client client, JenisLaundry jenisLaundry, int banyak, int totalBiaya){
        daftarJenisLaundry.add(jenisLaundry);
    }
    public static void tambahTransaksi(Transaksi transaksi){
        daftarTransaksi.add(transaksi);
    }
    public static void tambahPetugas(Petugas petugas){
        daftarPetugas.add(petugas);    
    }
    
    public static List<Client> getDaftarClient(){
        return daftarClient;
    }
    
    public static List<JenisLaundry> getDaftarJenisLaundry(){
        return daftarJenisLaundry;
    }
    public static List<Transaksi> getDaftarTransaksi(){
        return daftarTransaksi;
    }
    public static List<Petugas> getDaftarPetugas(){
        return daftarPetugas;
    }
}
