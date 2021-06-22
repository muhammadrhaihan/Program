public class baranghabis extends Penjual {
    private String namaBarang;
    private int    hargaBeli;
    private int    jumlahBarang;

    public void membelibarang(){
        System.out.println("Penjual membeli");
    }
    public void jumlahyangdibeli(){
        System.out.println("Penjual membeli barang sebanyak");
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    @Override
    public void memjual() {
        super.memjual();
    }

    @Override
    public void membeli() {
        super.membeli();
    }
}
