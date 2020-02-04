
public class pratikumclas {

    private String NIK;
    private String Nama;
    private String TTL;
    private String Jeniskelamin;
    private int Goldarah;

    public pratikumclas(String NIK, String Nama, String TTL, String Jeniskelamin, int Goldarah) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.TTL = TTL;
        this.Jeniskelamin = Jeniskelamin;
        this.Goldarah = Goldarah;
    }

    pratikumclas() {

    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getTTL() {
        return TTL;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.Jeniskelamin = Jeniskelamin;
    }

    public String getJeniskelamin() {
        return Jeniskelamin;
    }

    public void setGoldarah(int Goldarah) {
        this.Goldarah = Goldarah;
    }

    public int getGoldarah() {
        return Goldarah;
    }

    public void cetak() {
        System.out.println(" Informasi Data Diri Kamu ");
        System.out.println("NIK           : " + getNIK());
        System.out.println("Nama          : " + getNama());
        System.out.println("TTL           : " + getTTL());
        System.out.println("Jeniskelamin  : " + getJeniskelamin());
        System.out.println("GolonganDarah : " + getGoldarah());
    }
}
