public class nodeKendaraan {

    //Class ini digunakan utk node linked list antrian kendaraan dan menyimpan objek kendaraan dan pointer node

    // atribut
    kendaraan data;
    nodeKendaraan next;

    // konstruktor
    public nodeKendaraan(kendaraan data) {
        this.data = data;
        this.next = null;
    }

}