public class transaksi {
    String platNomor, jenisBBM;
    double hargaPerLiter;
    int jumlahLiter;

    public transaksi(String platNomor, String jenisBBM, double hargaPerLiter, int jumlahLiter) {
        this.platNomor = platNomor;
        this.jenisBBM = jenisBBM;
        this.hargaPerLiter = hargaPerLiter;
        this.jumlahLiter = jumlahLiter;
    }

    public double totalBayar() {
        return hargaPerLiter * jumlahLiter;
    }

    public void tampil() {
        System.out.printf("%s: Rp %.1f\n", platNomor, totalBayar());
    }
}
