package SmartRestaurantManagement.models;

public class MenuItem {
    private String id;
    private String nama;
    private String kategori;
    private double harga;

    public MenuItem(String id, String nama, String kategori, double harga) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
