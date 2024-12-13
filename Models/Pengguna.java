package smartrestaurantmanagement.models;

public abstract class Pengguna {
    protected String id;
    protected String nama;

    public Pengguna (String id, String nama){
        this.id = id;
        this.nama = nama;
    }

    public String getid(){
        return id;
    }

    public String getNama(){
        return nama;
    }
    public abstract void tampilkaninfo();
}
