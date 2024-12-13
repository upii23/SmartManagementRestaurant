package smartrestaurantmanagement.models;

import SmartRestaurantManagement.models.MenuItem;

import java.util.*;

public class Pesanan {
    private String idPesanan;
    private String namaPelanggan;
    private List<MenuItem> item;
    private String status;

    public Pesanan(String idPesanan, String namaPelanggan) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.item = new ArrayList<>();
        this.status = "Dalam Antrian";
    }

    public void tambahItem(MenuItem menu) {
        item.add(menu);
    }

    public double hitungTotal() {
        return item.stream().mapToDouble(MenuItem::getHarga).sum();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanDetailPesanan() {
        System.out.println("ID Pesanan: " + idPesanan);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Item:");
        for (MenuItem menu : item) {
            System.out.println("- " + menu.getNama() + " (Rp" + menu.getHarga() + ")");
        }
        System.out.println("Total: Rp" + hitungTotal());
        System.out.println("Status: " + status);
    }
}
