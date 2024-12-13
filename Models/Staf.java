package SmartRestaurantManagement.Models;

import SmartRestaurantManagement.SmartRestaurantManagement;

public class Staf extends SmartRestaurantManagement.Models.Pengguna {
    private String jadwal;

    public Staf(String id, String nama, String jadwal) {
        super(id, nama);
        this.jadwal = jadwal;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Staf: " + id + ", Nama: " + nama + ", Jadwal: " + jadwal);
    }
}
