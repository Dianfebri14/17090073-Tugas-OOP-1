package model;

public class Mobil {

    private String nomor;
    private String merek;
    private String harga;
    private String tanggal_pembelian;
    private String tahun_keluaran;
    private String type;
    private String bahan_bakar;

    public Mobil() {}

    public Mobil(String nomor, String merek, String harga, String tanggal_pembelian, String tahun_keluaran, String type, String bahan_bakar) {
        this.nomor = nomor;
        this.merek = merek;
        this.harga = harga;
        this.tanggal_pembelian = tanggal_pembelian;
        this.tahun_keluaran = tahun_keluaran;
        this.type = type;
        this.bahan_bakar = bahan_bakar;
    }

    @Override
    public boolean equals(Object obj) {
        Mobil mbl = (Mobil) obj;
        if(this.nomor.equals(mbl.getNomor())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + nomor + ", " + merek + ", " + harga + ", " + tanggal_pembelian + ", " + tahun_keluaran + " , " + type + ", " + bahan_bakar + " ];";
    }



    public void setNomor(String nomor) { this.nomor = nomor; }

    public String getNomor() { return nomor; }

    public void setMerek(String merek) { this.merek = merek; }

    public String getMerek() { return merek; }

    public void setHarga(String harga) { this.harga = harga; }

    public String getHarga() { return harga; }

    public void setTanggal_pembelian(String tanggal_pembelian) { this.tanggal_pembelian = tanggal_pembelian; }

    public String getTanggal_pembelian() { return tanggal_pembelian; }

    public void setTahun_keluaran(String tahun_keluaran) { this.tahun_keluaran = tahun_keluaran; }

    public String getTahun_keluaran() { return tahun_keluaran; }

    public void setType(String type) { this.type = type; }

    public String getType() { return type; }

    public void setBahan_bakar(String bahan_bakar) { this.bahan_bakar = bahan_bakar; }

    public String getBahan_bakar() { return bahan_bakar; }

}