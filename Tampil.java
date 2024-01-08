public class Tampil {
    public static void main(String[] args){
        Rumah r = new Rumah();
        Sekolah s = new Sekolah();
        System.out.println("DATA RUMAH");
        r.tampilLokasi();
        r.tampilUkuran(10, 17);
        System.out.println("DATA SEKOLAH");
        s.tampilNama("SMK Telkom Sandhy Putra Malang");
        s.jumlahSiswa(36, 13);
    
    }
    
}
