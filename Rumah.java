public class Rumah{
    public static void main(String[] args) {
        Rumah r = new Rumah();
        r.tampilLokasi();
        r.tampilUkuran(10, 8);
    }

    public void tampilLokasi(){
        String alamat="Malang";
        System.out.println("Lokasi Rumah: "+alamat);

    }
    public void tampilUkuran(int panjang,int lebar){
        int luas = panjang*lebar;
        System.out.println("Ukuran Rumah: "+luas);
    }

}