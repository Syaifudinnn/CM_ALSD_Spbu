public class linkedListAntrian {

    //Class ini digunakan utk struktur linked list antrian kendaraan

    //attribut head, tail, size
    nodeKendaraan head, tail;
    int size = 0;

    //method tambahAntrian
    public void tambahAntrian(kendaraan data) {
        nodeKendaraan newNode = new nodeKendaraan(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //method tampilkanAntrian
    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        nodeKendaraan current = head;
        System.out.println("Antrian : ");
        while (current != null) {
            current.data.tampilinformasi();
            current = current.next;
        }
    }

    //method getSize
    public int getSize() {
        return size;
    }

    //method layaniKendaraan
    public kendaraan layaniKendaraan() {
        if (head == null) {
            System.out.println("Tidak ada kendaraan dalam antrian.");
            return null;
        }
        kendaraan data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

}