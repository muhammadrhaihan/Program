import java.util.Date;

public class Penjual {
    private String kdBarang;
    private String namaBarang;
    private String jenisBarang;
    private int    stokBarang;
    private Date   tanggalBeli;
    private int    hargaBarang;
    private int    kadaluarsa;
    private String diskonBarang;

    public void memjual (){
        System.out.println("Penjual menjual berbagai barang");
    }
    public void menyediakan (){
        System.out.println("Penjual menjual menyediakan barang");
    }
    public void membeli (){
        System.out.println("Penjual membeli barang untuk menambah stok barang");
    }
    public void memberikanpromo (){
        System.out.println("Penjual memberikan promo diskon hingga");
    }

    public Penjual() {
    }

    public Penjual(String kdBarang, String namaBarang, int stokBarang, int hargaBarang) {
        this.kdBarang = kdBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.hargaBarang = hargaBarang;
    }

    public Penjual(String kdBarang, String namaBarang, String jenisBarang, int stokBarang, Date tanggalBeli, int hargaBarang, int kadaluarsa, String diskonBarang) {
        this.kdBarang = kdBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.stokBarang = stokBarang;
        this.tanggalBeli = tanggalBeli;
        this.hargaBarang = hargaBarang;
        this.kadaluarsa = kadaluarsa;
        this.diskonBarang = diskonBarang;
    }

    public String getKdBarang() {
        return kdBarang;
    }

    public void setKdBarang(String kdBarang) {
        this.kdBarang = kdBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public Date getTanggalBeli() {
        return tanggalBeli;
    }

    public void setTanggalBeli(Date tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(int kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }

    public String getDiskonBarang() {
        return diskonBarang;
    }

    public void setDiskonBarang(String diskonBarang) {
        this.diskonBarang = diskonBarang;
    }
}
