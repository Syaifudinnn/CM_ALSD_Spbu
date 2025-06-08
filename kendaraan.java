public class kendaraan {

    String platNomor;
    String jenis;
    String merk;

    kendaraan(){

    }

    kendaraan(String platNomor, String jenis,String merk){
        this.platNomor=platNomor;
        this.jenis=jenis;
        this.merk=merk;
    }


    void tampilinformasi() {
         System.out.println(">> " + platNomor + " - " + jenis + " - " + merk);
    }
}