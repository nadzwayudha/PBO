public class SPP {
    public static void main(String[] args) {
        SPP s = new SPP();
        s.tampilNama();
        s.tampilBayaran(3, 500000);
    }
        public void tampilNama(){
            String Nama = "Nadzwa Yudha";
            System.out.println("Nama: " + Nama);

        }
        
        public void tampilBayaran(int bulan,int biayaspp){
            int bayaran = bulan*biayaspp;
            System.out.println("Total yang harus dibayar: " + bayaran);
        }
    }
