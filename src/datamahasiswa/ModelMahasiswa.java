 package datamahasiswa;


    public class ModelMahasiswa {
    private String npm;
    private String nama;
    private int tinggi;
    private boolean pindahan;

    public ModelMahasiswa(String npm, String nama, int tinggi, boolean pindahan) {
        this.npm = npm;
        this.nama = nama;
        this.tinggi = tinggi;
        this.pindahan = pindahan;
    }

    public String getNPM() {
        return npm;
    }
    
    public void setNPM(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public boolean isPindahan() {
        return pindahan;
    }

    public void setPindahan(boolean pindahan) {  // Add type boolean here
        this.pindahan = pindahan;
    }
}

